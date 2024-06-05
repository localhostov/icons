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

public val Icons.Outline.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(21.029f, 16.271f)
                arcToRelative(16.208f, 16.208f, 0.0f, false, true, -11.229f, -0.582f)
                arcToRelative(9.957f, 9.957f, 0.0f, false, true, 2.369f, -2.549f)
                arcToRelative(11.972f, 11.972f, 0.0f, false, false, 4.448f, 0.873f)
                arcToRelative(12.071f, 12.071f, 0.0f, false, false, 5.348f, -1.25f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, true, -0.936f, 3.508f)
                close()
                moveTo(21.875f, 10.503f)
                arcToRelative(9.969f, 9.969f, 0.0f, false, true, -2.935f, 1.23f)
                arcToRelative(18.165f, 18.165f, 0.0f, false, false, -3.074f, -8.954f)
                arcToRelative(10.019f, 10.019f, 0.0f, false, true, 6.009f, 7.721f)
                close()
                moveTo(12.748f, 2.038f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 4.2f, 9.949f)
                arcToRelative(9.957f, 9.957f, 0.0f, false, true, -4.0f, -0.69f)
                arcToRelative(12.031f, 12.031f, 0.0f, false, false, -4.448f, -8.651f)
                arcToRelative(9.922f, 9.922f, 0.0f, false, true, 3.5f, -0.646f)
                curveToRelative(0.253f, 0.0f, 0.5f, 0.019f, 0.748f, 0.038f)
                close()
                moveTo(6.487f, 3.665f)
                arcToRelative(10.018f, 10.018f, 0.0f, false, true, 2.455f, 2.266f)
                arcToRelative(18.207f, 18.207f, 0.0f, false, false, -6.71f, 8.194f)
                arcToRelative(9.962f, 9.962f, 0.0f, false, true, 4.255f, -10.46f)
                close()
                moveTo(3.365f, 17.02f)
                arcToRelative(16.217f, 16.217f, 0.0f, false, true, 6.611f, -9.37f)
                arcToRelative(9.963f, 9.963f, 0.0f, false, true, 0.993f, 3.891f)
                arcToRelative(12.033f, 12.033f, 0.0f, false, false, -4.715f, 8.63f)
                arcToRelative(10.069f, 10.069f, 0.0f, false, true, -2.889f, -3.151f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(9.948f, 9.948f, 0.0f, false, true, -3.772f, -0.744f)
                arcToRelative(9.983f, 9.983f, 0.0f, false, true, 0.672f, -3.775f)
                arcToRelative(18.248f, 18.248f, 0.0f, false, false, 7.3f, 1.542f)
                arcToRelative(18.119f, 18.119f, 0.0f, false, false, 3.172f, -0.286f)
                arcToRelative(9.961f, 9.961f, 0.0f, false, true, -7.372f, 3.263f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
