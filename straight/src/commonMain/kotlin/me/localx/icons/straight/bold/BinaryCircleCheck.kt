package me.localx.icons.straight.bold

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

public val Icons.Bold.BinaryCircleCheck: ImageVector
    get() {
        if (_binaryCircleCheck != null) {
            return _binaryCircleCheck!!
        }
        _binaryCircleCheck = Builder(name = "BinaryCircleCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.56f)
                lineToRelative(-1.88f, -1.83f)
                lineTo(11.78f, 0.0f)
                horizontalLineToRelative(2.22f)
                lineTo(14.0f, 9.76f)
                curveToRelative(-0.72f, 0.32f, -1.38f, 0.74f, -1.97f, 1.24f)
                horizontalLineToRelative(-1.03f)
                lineTo(11.0f, 4.56f)
                close()
                moveTo(9.0f, 17.5f)
                curveToRelative(0.0f, -1.56f, 0.43f, -3.02f, 1.16f, -4.27f)
                curveToRelative(-1.82f, 0.57f, -3.16f, 2.26f, -3.16f, 4.27f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.16f, 0.0f, 0.32f, -0.03f, 0.48f, -0.05f)
                curveToRelative(-1.82f, -1.56f, -2.98f, -3.87f, -2.98f, -6.45f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(22.02f, 16.52f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-3.34f, 3.34f)
                lineToRelative(-1.62f, -1.74f)
                lineToRelative(-2.16f, 2.08f)
                lineToRelative(2.03f, 2.17f)
                curveToRelative(0.45f, 0.48f, 1.05f, 0.74f, 1.7f, 0.75f)
                horizontalLineToRelative(0.04f)
                curveToRelative(0.64f, 0.0f, 1.24f, -0.25f, 1.69f, -0.7f)
                lineToRelative(3.78f, -3.79f)
                close()
                moveTo(0.0f, 6.5f)
                verticalLineToRelative(-2.0f)
                curveTo(0.0f, 2.02f, 2.02f, 0.0f, 4.5f, 0.0f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveTo(0.0f, 8.98f, 0.0f, 6.5f)
                close()
                moveTo(3.0f, 6.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(2.78f, 13.0f)
                lineTo(0.12f, 15.72f)
                lineToRelative(1.88f, 1.83f)
                verticalLineToRelative(6.44f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 13.0f)
                lineTo(2.78f, 13.0f)
                close()
            }
        }
        .build()
        return _binaryCircleCheck!!
    }

private var _binaryCircleCheck: ImageVector? = null
