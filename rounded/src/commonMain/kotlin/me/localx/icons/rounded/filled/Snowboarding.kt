package me.localx.icons.rounded.filled

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

public val Icons.Filled.Snowboarding: ImageVector
    get() {
        if (_snowboarding != null) {
            return _snowboarding!!
        }
        _snowboarding = Builder(name = "Snowboarding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.433f, 20.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.334f, 0.468f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.7f, 0.926f)
                lineTo(17.0f, 20.726f)
                verticalLineTo(15.877f)
                arcToRelative(3.027f, 3.027f, 0.0f, false, false, -0.99f, -2.227f)
                lineTo(13.416f, 11.4f)
                lineToRelative(2.747f, -3.566f)
                lineToRelative(6.3f, 4.009f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.074f, -1.688f)
                reflectiveCurveTo(13.077f, 3.538f, 12.673f, 3.351f)
                arcTo(4.98f, 4.98f, 0.0f, false, false, 10.835f, 3.0f)
                horizontalLineTo(9.657f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, true, -2.122f, -0.878f)
                lineTo(5.707f, 0.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.293f, 1.707f)
                lineTo(6.121f, 3.536f)
                arcTo(4.968f, 4.968f, 0.0f, false, false, 9.657f, 5.0f)
                horizontalLineToRelative(1.156f)
                lineTo(8.621f, 7.852f)
                arcTo(3.018f, 3.018f, 0.0f, false, false, 8.0f, 9.68f)
                verticalLineToRelative(3.084f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, -0.553f, 0.894f)
                lineTo(4.553f, 15.105f)
                arcToRelative(1.132f, 1.132f, 0.0f, false, false, -0.108f, 0.063f)
                lineTo(3.159f, 14.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.973f, -2.655f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.371f, 11.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.963f, 5.318f)
                lineToRelative(16.231f, 7.184f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, false, 1.727f, 0.4f)
                arcToRelative(4.026f, 4.026f, 0.0f, false, false, 1.33f, -0.228f)
                arcTo(3.973f, 3.973f, 0.0f, false, false, 23.9f, 21.729f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.433f, 20.4f)
                close()
                moveTo(8.342f, 15.447f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 10.0f, 12.764f)
                verticalLineTo(11.083f)
                lineToRelative(4.677f, 4.058f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 0.323f, 0.736f)
                verticalLineTo(19.84f)
                lineTo(6.808f, 16.214f)
                close()
                moveTo(17.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 15.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 5.0f)
                close()
            }
        }
        .build()
        return _snowboarding!!
    }

private var _snowboarding: ImageVector? = null
