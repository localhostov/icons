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

public val Icons.Filled.BinaryCircleCheck: ImageVector
    get() {
        if (_binaryCircleCheck != null) {
            return _binaryCircleCheck!!
        }
        _binaryCircleCheck = Builder(name = "BinaryCircleCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.87f, 19.46f)
                curveToRelative(-0.36f, 0.36f, -0.83f, 0.55f, -1.33f, 0.55f)
                curveToRelative(-0.01f, 0.0f, -0.02f, 0.0f, -0.03f, 0.0f)
                curveToRelative(-0.51f, 0.0f, -0.99f, -0.22f, -1.34f, -0.6f)
                lineToRelative(-1.99f, -2.08f)
                lineToRelative(1.44f, -1.39f)
                lineToRelative(1.93f, 2.02f)
                lineToRelative(3.22f, -3.22f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.3f, 3.3f)
                close()
                moveTo(4.0f, 11.0f)
                curveTo(1.79f, 11.0f, 0.0f, 9.21f, 0.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveTo(0.0f, 1.79f, 1.79f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(4.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(5.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-7.63f)
                lineToRelative(-1.58f, 1.63f)
                lineTo(-0.02f, 16.6f)
                lineToRelative(3.51f, -3.6f)
                horizontalLineToRelative(1.42f)
                lineToRelative(0.09f, 1.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(11.42f, 5.0f)
                lineToRelative(-1.43f, -1.4f)
                lineTo(13.49f, 0.0f)
                horizontalLineToRelative(1.42f)
                lineToRelative(0.09f, 1.0f)
                verticalLineToRelative(7.23f)
                curveToRelative(-0.7f, 0.16f, -1.37f, 0.4f, -2.0f, 0.72f)
                lineTo(13.0f, 3.37f)
                lineToRelative(-1.58f, 1.63f)
                close()
            }
        }
        .build()
        return _binaryCircleCheck!!
    }

private var _binaryCircleCheck: ImageVector? = null
