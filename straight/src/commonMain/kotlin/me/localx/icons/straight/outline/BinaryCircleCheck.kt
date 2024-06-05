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

public val Icons.Outline.BinaryCircleCheck: ImageVector
    get() {
        if (_binaryCircleCheck != null) {
            return _binaryCircleCheck!!
        }
        _binaryCircleCheck = Builder(name = "BinaryCircleCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.07f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.07f, 22.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(5.07f, 13.0f)
                verticalLineToRelative(11.0f)
                lineTo(3.07f, 24.0f)
                verticalLineToRelative(-7.63f)
                lineToRelative(-1.58f, 1.63f)
                lineTo(0.05f, 16.6f)
                lineToRelative(3.51f, -3.6f)
                horizontalLineToRelative(1.51f)
                close()
                moveTo(21.23f, 16.16f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.36f, 0.36f, -0.83f, 0.55f, -1.33f, 0.55f)
                curveToRelative(-0.01f, 0.0f, -0.02f, 0.0f, -0.03f, 0.0f)
                curveToRelative(-0.51f, 0.0f, -0.99f, -0.22f, -1.34f, -0.6f)
                lineToRelative(-1.99f, -2.08f)
                lineToRelative(1.44f, -1.39f)
                lineToRelative(1.93f, 2.02f)
                lineToRelative(3.22f, -3.22f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(15.07f, 0.0f)
                lineTo(15.07f, 8.23f)
                curveToRelative(-0.7f, 0.16f, -1.37f, 0.4f, -2.0f, 0.72f)
                lineTo(13.07f, 3.37f)
                lineToRelative(-1.58f, 1.63f)
                lineToRelative(-1.43f, -1.4f)
                lineTo(13.56f, 0.0f)
                horizontalLineToRelative(1.51f)
                close()
                moveTo(4.07f, 0.0f)
                curveTo(1.86f, 0.0f, 0.07f, 1.79f, 0.07f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                curveTo(8.07f, 1.79f, 6.28f, 0.0f, 4.07f, 0.0f)
                close()
                moveTo(6.07f, 7.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _binaryCircleCheck!!
    }

private var _binaryCircleCheck: ImageVector? = null
