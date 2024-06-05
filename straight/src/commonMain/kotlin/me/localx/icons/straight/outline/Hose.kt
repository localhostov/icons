package me.localx.icons.straight.outline

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

public val Icons.Outline.Hose: ImageVector
    get() {
        if (_hose != null) {
            return _hose!!
        }
        _hose = Builder(name = "Hose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 18.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.135f, 5.961f)
                lineToRelative(7.865f, -1.461f)
                lineTo(24.0f, 1.5f)
                lineTo(16.135f, 0.039f)
                curveToRelative(-0.594f, -0.099f, -1.135f, 0.359f, -1.135f, 0.961f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 2.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 10.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.602f, 0.541f, 1.06f, 1.135f, 0.961f)
                close()
            }
        }
        .build()
        return _hose!!
    }

private var _hose: ImageVector? = null
