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

public val Icons.Filled.HandMiddleFinger: ImageVector
    get() {
        if (_handMiddleFinger != null) {
            return _handMiddleFinger!!
        }
        _handMiddleFinger = Builder(name = "HandMiddleFinger", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 9.534f)
                verticalLineTo(2.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(5.821f)
                lineToRelative(-0.474f, -0.112f)
                curveToRelative(-1.8f, -0.425f, -3.526f, 0.941f, -3.526f, 2.79f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.389f)
                lineToRelative(-3.121f, 3.025f)
                curveToRelative(-0.703f, 0.702f, -1.013f, 1.706f, -0.828f, 2.682f)
                curveToRelative(0.126f, 0.625f, 0.44f, 1.196f, 0.9f, 1.637f)
                lineToRelative(5.049f, 5.045f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-13.0f)
                lineToRelative(-6.0f, -1.466f)
                close()
            }
        }
        .build()
        return _handMiddleFinger!!
    }

private var _handMiddleFinger: ImageVector? = null
