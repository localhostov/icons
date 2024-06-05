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

public val Icons.Outline.Restaurant: ImageVector
    get() {
        if (_restaurant != null) {
            return _restaurant!!
        }
        _restaurant = Builder(name = "Restaurant", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.343f, 7.238f)
                arcTo(10.985f, 10.985f, 0.0f, false, true, 0.01f, 1.95f)
                arcTo(1.948f, 1.948f, 0.0f, false, true, 3.336f, 0.572f)
                lineToRelative(5.15f, 5.489f)
                arcToRelative(4.978f, 4.978f, 0.0f, false, false, -0.481f, 2.11f)
                curveToRelative(0.0f, 0.113f, 0.025f, 0.222f, 0.032f, 0.334f)
                lineTo(2.01f, 2.079f)
                arcTo(8.965f, 8.965f, 0.0f, false, false, 3.093f, 6.273f)
                arcTo(22.462f, 22.462f, 0.0f, false, false, 7.558f, 12.2f)
                lineTo(6.143f, 13.62f)
                arcTo(23.638f, 23.638f, 0.0f, false, true, 1.343f, 7.238f)
                close()
                moveTo(12.912f, 15.33f)
                lineToRelative(-1.543f, 1.545f)
                arcToRelative(11.311f, 11.311f, 0.0f, false, false, 5.415f, 0.972f)
                lineToRelative(5.748f, 6.109f)
                lineToRelative(1.456f, -1.37f)
                lineToRelative(-6.471f, -6.9f)
                arcTo(8.122f, 8.122f, 0.0f, false, true, 12.912f, 15.33f)
                close()
                moveTo(13.706f, 13.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.239f, 0.0f)
                lineTo(24.01f, 7.05f)
                lineTo(22.6f, 5.635f)
                lineToRelative(-6.065f, 6.072f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(14.412f, 11.0f)
                lineToRelative(6.773f, -6.779f)
                lineTo(19.772f, 2.806f)
                lineTo(13.0f, 9.586f)
                lineToRelative(-0.706f, -0.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.415f)
                lineToRelative(6.065f, -6.072f)
                lineTo(16.945f, -0.022f)
                lineTo(10.88f, 6.05f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, false, 0.0f, 4.243f)
                lineToRelative(0.706f, 0.707f)
                lineTo(0.034f, 22.564f)
                lineToRelative(1.413f, 1.414f)
                lineTo(13.0f, 12.414f)
                close()
            }
        }
        .build()
        return _restaurant!!
    }

private var _restaurant: ImageVector? = null
