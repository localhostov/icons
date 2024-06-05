package me.localx.icons.straight.filled

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

public val Icons.Filled.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.526f, 16.3f)
                arcToRelative(14.565f, 14.565f, 0.0f, false, false, 0.862f, -4.561f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, -0.608f, -1.5f)
                lineTo(18.961f, 8.469f)
                lineToRelative(5.045f, -5.045f)
                lineToRelative(-1.43f, -1.43f)
                lineTo(17.514f, 7.056f)
                lineTo(15.307f, 4.9f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.6f, 4.826f)
                arcToRelative(23.888f, 23.888f, 0.0f, false, true, -2.09f, 1.632f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.771f, 7.557f)
                arcTo(12.334f, 12.334f, 0.0f, false, true, 6.227f, 8.694f)
                lineTo(0.0f, 10.521f)
                verticalLineToRelative(0.749f)
                arcTo(12.431f, 12.431f, 0.0f, false, false, 0.93f, 16.0f)
                lineToRelative(1.708f, -0.279f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, 4.3f, -2.434f)
                lineToRelative(1.4f, 1.43f)
                arcToRelative(11.649f, 11.649f, 0.0f, false, true, -5.295f, 2.961f)
                lineToRelative(-1.156f, 0.191f)
                arcToRelative(12.911f, 12.911f, 0.0f, false, false, 2.5f, 2.925f)
                lineToRelative(2.026f, -0.752f)
                lineToRelative(1.4f, -0.7f)
                arcTo(9.544f, 9.544f, 0.0f, false, false, 11.4f, 16.2f)
                lineToRelative(0.519f, -0.761f)
                lineToRelative(1.652f, 1.126f)
                lineToRelative(-0.518f, 0.761f)
                arcToRelative(11.535f, 11.535f, 0.0f, false, true, -4.347f, 3.8f)
                lineToRelative(-1.55f, 0.773f)
                lineToRelative(-0.815f, 0.3f)
                arcTo(13.142f, 13.142f, 0.0f, false, false, 13.007f, 24.0f)
                horizontalLineToRelative(1.238f)
                lineToRelative(0.258f, -0.18f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 5.144f, -5.577f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
