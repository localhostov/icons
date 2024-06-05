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

public val Icons.Bold.MemoCircleCheck: ImageVector
    get() {
        if (_memoCircleCheck != null) {
            return _memoCircleCheck!!
        }
        _memoCircleCheck = Builder(name = "MemoCircleCheck", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.028f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.525f)
                curveToRelative(-0.166f, -0.01f, -0.331f, -0.025f, -0.5f, -0.025f)
                curveToRelative(-0.87f, 0.0f, -1.709f, 0.132f, -2.5f, 0.375f)
                lineTo(15.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(6.76f)
                curveToRelative(0.527f, 1.163f, 1.304f, 2.187f, 2.268f, 3.0f)
                close()
                moveTo(13.0f, 10.298f)
                verticalLineToRelative(-0.298f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.298f)
                curveToRelative(0.685f, -1.093f, 1.609f, -2.017f, 2.702f, -2.702f)
                close()
                moveTo(13.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(22.549f, 16.572f)
                lineToRelative(-2.098f, -2.145f)
                lineToRelative(-3.454f, 3.375f)
                lineToRelative(-1.957f, -1.884f)
                lineToRelative(-2.08f, 2.162f)
                lineToRelative(2.272f, 2.187f)
                curveToRelative(0.489f, 0.489f, 1.132f, 0.732f, 1.772f, 0.732f)
                curveToRelative(0.636f, 0.0f, 1.271f, -0.24f, 1.751f, -0.721f)
                lineToRelative(3.793f, -3.707f)
                close()
            }
        }
        .build()
        return _memoCircleCheck!!
    }

private var _memoCircleCheck: ImageVector? = null
