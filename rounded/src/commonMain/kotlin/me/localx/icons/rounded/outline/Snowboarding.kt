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

public val Icons.Outline.Snowboarding: ImageVector
    get() {
        if (_snowboarding != null) {
            return _snowboarding!!
        }
        _snowboarding = Builder(name = "Snowboarding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.432f, 20.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.334f, 0.469f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -2.695f, 0.926f)
                lineTo(17.0f, 20.727f)
                verticalLineTo(15.878f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, -0.968f, -2.207f)
                lineToRelative(-1.954f, -1.8f)
                curveToRelative(-0.026f, -0.022f, -0.038f, -0.062f, -0.065f, -0.082f)
                lineToRelative(2.161f, -2.947f)
                lineToRelative(6.289f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.074f, -1.687f)
                lineTo(13.519f, 4.782f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 10.835f, 4.0f)
                horizontalLineTo(9.657f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, -2.122f, -0.878f)
                lineTo(5.707f, 1.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.293f, 2.708f)
                lineTo(6.121f, 4.536f)
                arcTo(4.968f, 4.968f, 0.0f, false, false, 9.657f, 6.0f)
                horizontalLineToRelative(1.156f)
                lineTo(8.621f, 8.852f)
                arcTo(3.012f, 3.012f, 0.0f, false, false, 8.0f, 10.681f)
                verticalLineToRelative(2.084f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, -0.553f, 0.894f)
                lineToRelative(-2.9f, 1.447f)
                arcToRelative(0.877f, 0.877f, 0.0f, false, false, -0.09f, 0.071f)
                lineTo(3.16f, 14.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.975f, -2.656f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.371f, 11.1f)
                arcToRelative(4.009f, 4.009f, 0.0f, false, false, 1.963f, 5.318f)
                lineToRelative(16.231f, 7.185f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 23.9f, 21.73f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.432f, 20.4f)
                close()
                moveTo(8.341f, 15.448f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 10.0f, 12.765f)
                verticalLineTo(10.681f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.207f, -0.61f)
                lineTo(12.8f, 6.7f)
                lineToRelative(1.682f, 1.07f)
                lineToRelative(-2.07f, 2.824f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.341f, 2.782f)
                lineToRelative(1.923f, 1.771f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.323f, 0.735f)
                verticalLineToRelative(3.963f)
                lineTo(6.808f, 16.215f)
                close()
                moveTo(14.911f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.911f, 2.5f)
                close()
            }
        }
        .build()
        return _snowboarding!!
    }

private var _snowboarding: ImageVector? = null
