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

public val Icons.Outline.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 24.0f)
                horizontalLineToRelative(-9.995f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, true, -3.045f, -1.4f)
                arcToRelative(3.945f, 3.945f, 0.0f, false, true, -0.916f, -3.158f)
                arcToRelative(12.517f, 12.517f, 0.0f, false, true, 4.401f, -7.442f)
                arcToRelative(12.517f, 12.517f, 0.0f, false, true, -4.4f, -7.444f)
                arcToRelative(3.945f, 3.945f, 0.0f, false, true, 0.915f, -3.156f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, true, 3.045f, -1.4f)
                horizontalLineToRelative(9.995f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, 3.044f, 1.4f)
                arcToRelative(3.943f, 3.943f, 0.0f, false, true, 0.918f, 3.155f)
                arcToRelative(12.556f, 12.556f, 0.0f, false, true, -4.411f, 7.445f)
                arcToRelative(12.557f, 12.557f, 0.0f, false, true, 4.406f, 7.448f)
                arcToRelative(3.944f, 3.944f, 0.0f, false, true, -0.918f, 3.156f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, -3.039f, 1.396f)
                close()
                moveTo(17.0f, 2.0f)
                horizontalLineToRelative(-9.995f)
                arcToRelative(2.014f, 2.014f, 0.0f, false, false, -1.528f, 0.7f)
                arcToRelative(1.917f, 1.917f, 0.0f, false, false, -0.455f, 1.556f)
                curveToRelative(0.375f, 2.5f, 1.922f, 4.84f, 4.6f, 6.957f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.568f)
                curveToRelative(-2.678f, 2.119f, -4.222f, 4.461f, -4.6f, 6.96f)
                arcToRelative(1.917f, 1.917f, 0.0f, false, false, 0.455f, 1.559f)
                arcToRelative(2.014f, 2.014f, 0.0f, false, false, 1.528f, 0.7f)
                horizontalLineToRelative(9.995f)
                arcToRelative(2.014f, 2.014f, 0.0f, false, false, 1.528f, -0.7f)
                arcToRelative(1.917f, 1.917f, 0.0f, false, false, 0.456f, -1.554f)
                curveToRelative(-0.373f, -2.487f, -1.92f, -4.829f, -4.6f, -6.962f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.564f)
                curveToRelative(2.681f, -2.133f, 4.228f, -4.475f, 4.6f, -6.963f)
                arcToRelative(1.916f, 1.916f, 0.0f, false, false, -0.461f, -1.557f)
                arcToRelative(2.014f, 2.014f, 0.0f, false, false, -1.523f, -0.7f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
