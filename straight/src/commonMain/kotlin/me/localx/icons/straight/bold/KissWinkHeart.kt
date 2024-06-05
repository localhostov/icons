package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.KissWinkHeart: ImageVector
    get() {
        if (_kissWinkHeart != null) {
            return _kissWinkHeart!!
        }
        _kissWinkHeart = Builder(name = "KissWinkHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.313f, 20.36f)
                arcTo(14.751f, 14.751f, 0.0f, false, false, 16.4f, 23.152f)
                curveTo(8.8f, 26.351f, -0.174f, 20.29f, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.374f, 3.8f)
                arcToRelative(3.792f, 3.792f, 0.0f, false, false, -1.422f, -0.193f)
                arcToRelative(3.821f, 3.821f, 0.0f, false, false, -1.305f, -1.133f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -5.334f, 5.889f)
                close()
                moveTo(18.0f, 9.667f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(22.943f, 17.776f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -2.424f, 0.922f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, -0.886f, -2.521f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -2.424f, 0.921f)
                curveTo(16.312f, 19.106f, 18.6f, 23.0f, 18.6f, 23.0f)
                reflectiveCurveToRelative(4.336f, -0.7f, 5.234f, -2.7f)
                arcTo(1.931f, 1.931f, 0.0f, false, false, 22.943f, 17.776f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, 1.987f, -4.0f)
                arcTo(2.471f, 2.471f, 0.0f, false, false, 15.0f, 14.5f)
                close()
            }
        }
        .build()
        return _kissWinkHeart!!
    }

private var _kissWinkHeart: ImageVector? = null
