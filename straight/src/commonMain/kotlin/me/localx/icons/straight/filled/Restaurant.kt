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

public val Icons.Filled.Restaurant: ImageVector
    get() {
        if (_restaurant != null) {
            return _restaurant!!
        }
        _restaurant = Builder(name = "Restaurant", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 12.414f)
                lineTo(1.447f, 23.978f)
                lineTo(0.034f, 22.564f)
                lineTo(11.586f, 11.0f)
                lineToRelative(-0.706f, -0.707f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 0.0f, -4.243f)
                lineTo(16.945f, -0.022f)
                lineToRelative(1.413f, 1.414f)
                lineTo(12.293f, 7.464f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.415f)
                lineTo(13.0f, 9.586f)
                lineToRelative(6.773f, -6.78f)
                lineToRelative(1.413f, 1.415f)
                lineTo(14.412f, 11.0f)
                lineToRelative(0.706f, 0.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineTo(22.6f, 5.635f)
                lineTo(24.01f, 7.05f)
                lineToRelative(-6.065f, 6.071f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.239f, 0.0f)
                close()
                moveTo(6.143f, 13.62f)
                lineToRelative(2.689f, -2.692f)
                arcToRelative(4.94f, 4.94f, 0.0f, false, true, -0.328f, -4.9f)
                lineTo(3.336f, 0.572f)
                arcTo(1.948f, 1.948f, 0.0f, false, false, 0.01f, 1.95f)
                arcTo(10.985f, 10.985f, 0.0f, false, false, 1.343f, 7.238f)
                arcTo(23.638f, 23.638f, 0.0f, false, false, 6.143f, 13.62f)
                close()
                moveTo(15.825f, 16.0f)
                arcToRelative(4.956f, 4.956f, 0.0f, false, true, -2.754f, -0.828f)
                lineToRelative(-1.7f, 1.7f)
                arcToRelative(11.311f, 11.311f, 0.0f, false, false, 5.415f, 0.972f)
                lineToRelative(5.748f, 6.109f)
                lineToRelative(1.456f, -1.37f)
                lineToRelative(-6.535f, -6.878f)
                arcTo(4.981f, 4.981f, 0.0f, false, true, 15.825f, 16.0f)
                close()
            }
        }
        .build()
        return _restaurant!!
    }

private var _restaurant: ImageVector? = null
