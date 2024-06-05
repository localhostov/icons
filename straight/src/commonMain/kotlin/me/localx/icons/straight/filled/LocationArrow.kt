package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = Builder(name = "LocationArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.895f, 24.001f)
                curveToRelative(-0.172f, 0.0f, -0.346f, -0.016f, -0.521f, -0.046f)
                curveToRelative(-1.398f, -0.245f, -2.374f, -1.408f, -2.374f, -2.827f)
                verticalLineToRelative(-7.128f)
                horizontalLineTo(2.871f)
                curveToRelative(-1.419f, 0.0f, -2.581f, -0.977f, -2.826f, -2.374f)
                curveToRelative(-0.244f, -1.395f, 0.513f, -2.705f, 1.841f, -3.189f)
                lineTo(24.028f, -0.014f)
                lineToRelative(-8.468f, 22.137f)
                curveToRelative(-0.417f, 1.151f, -1.474f, 1.878f, -2.666f, 1.878f)
                close()
            }
        }
        .build()
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
