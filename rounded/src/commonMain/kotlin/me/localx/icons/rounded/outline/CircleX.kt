package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.CircleX: ImageVector
    get() {
        if (_circleX != null) {
            return _circleX!!
        }
        _circleX = Builder(name = "CircleX", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.038f, 0.02f)
                curveTo(5.421f, 0.02f, 0.038f, 5.402f, 0.038f, 12.02f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.02f, 12.038f, 0.02f)
                close()
                moveTo(12.038f, 22.02f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.02f, 12.038f, 2.02f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(16.803f, 7.915f)
                lineToRelative(-3.457f, 4.105f)
                lineToRelative(3.457f, 4.105f)
                curveToRelative(0.356f, 0.423f, 0.302f, 1.054f, -0.12f, 1.409f)
                curveToRelative(-0.188f, 0.158f, -0.417f, 0.235f, -0.644f, 0.235f)
                curveToRelative(-0.285f, 0.0f, -0.568f, -0.121f, -0.766f, -0.355f)
                lineToRelative(-3.235f, -3.842f)
                lineToRelative(-3.235f, 3.842f)
                curveToRelative(-0.197f, 0.234f, -0.48f, 0.355f, -0.766f, 0.355f)
                curveToRelative(-0.227f, 0.0f, -0.456f, -0.077f, -0.644f, -0.235f)
                curveToRelative(-0.422f, -0.355f, -0.477f, -0.986f, -0.12f, -1.409f)
                lineToRelative(3.457f, -4.105f)
                lineToRelative(-3.457f, -4.105f)
                curveToRelative(-0.356f, -0.423f, -0.302f, -1.054f, 0.12f, -1.409f)
                curveToRelative(0.423f, -0.358f, 1.055f, -0.301f, 1.409f, 0.12f)
                lineToRelative(3.235f, 3.842f)
                lineToRelative(3.235f, -3.842f)
                curveToRelative(0.354f, -0.42f, 0.986f, -0.478f, 1.409f, -0.12f)
                curveToRelative(0.422f, 0.355f, 0.477f, 0.986f, 0.12f, 1.409f)
                close()
            }
        }
        .build()
        return _circleX!!
    }

private var _circleX: ImageVector? = null
