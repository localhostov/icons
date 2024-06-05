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

public val Icons.Outline.Cricket: ImageVector
    get() {
        if (_cricket != null) {
            return _cricket!!
        }
        _cricket = Builder(name = "Cricket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.721f, 11.0f)
                arcTo(2.526f, 2.526f, 0.0f, false, true, 16.5f, 9.98f)
                arcTo(2.686f, 2.686f, 0.0f, false, true, 17.311f, 8.1f)
                lineTo(21.5f, 3.914f)
                lineToRelative(0.793f, 0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(0.793f, 0.793f)
                lineTo(15.9f, 6.689f)
                arcToRelative(2.687f, 2.687f, 0.0f, false, true, -1.847f, 0.811f)
                arcTo(2.437f, 2.437f, 0.0f, false, true, 13.0f, 7.276f)
                arcToRelative(3.041f, 3.041f, 0.0f, false, false, -3.418f, 0.578f)
                lineTo(0.917f, 16.518f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.853f, 1.711f)
                arcToRelative(5.054f, 5.054f, 0.0f, false, false, 1.3f, 4.405f)
                arcTo(4.841f, 4.841f, 0.0f, false, false, 4.869f, 24.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 0.9f, -0.064f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, false, 1.71f, -0.852f)
                lineToRelative(8.664f, -8.663f)
                arcTo(3.05f, 3.05f, 0.0f, false, false, 16.721f, 11.0f)
                close()
                moveTo(12.184f, 9.1f)
                arcToRelative(4.466f, 4.466f, 0.0f, false, false, 1.883f, 0.4f)
                arcToRelative(3.984f, 3.984f, 0.0f, false, false, 0.463f, -0.03f)
                arcToRelative(4.412f, 4.412f, 0.0f, false, false, -0.03f, 0.513f)
                arcToRelative(4.487f, 4.487f, 0.0f, false, false, 0.393f, 1.823f)
                arcToRelative(1.141f, 1.141f, 0.0f, false, true, 0.0f, 0.976f)
                arcTo(4.292f, 4.292f, 0.0f, false, false, 12.424f, 12.0f)
                arcToRelative(1.444f, 1.444f, 0.0f, false, true, -0.379f, -0.031f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, true, -0.045f, -0.3f)
                arcTo(4.337f, 4.337f, 0.0f, false, false, 11.22f, 9.1f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, true, 0.467f, -0.11f)
                arcTo(1.2f, 1.2f, 0.0f, false, true, 12.184f, 9.1f)
                close()
                moveTo(6.066f, 21.669f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.577f, 0.286f)
                arcTo(3.115f, 3.115f, 0.0f, false, true, 2.78f, 21.22f)
                arcToRelative(3.125f, 3.125f, 0.0f, false, true, -0.735f, -2.708f)
                arcToRelative(1.016f, 1.016f, 0.0f, false, true, 0.286f, -0.58f)
                lineToRelative(7.413f, -7.413f)
                arcTo(2.551f, 2.551f, 0.0f, false, true, 10.0f, 11.673f)
                arcTo(2.166f, 2.166f, 0.0f, false, false, 12.413f, 14.0f)
                arcToRelative(2.384f, 2.384f, 0.0f, false, true, 1.071f, 0.253f)
                close()
                moveTo(20.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 24.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 17.0f)
                close()
                moveTo(20.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 22.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 22.0f)
                close()
            }
        }
        .build()
        return _cricket!!
    }

private var _cricket: ImageVector? = null
