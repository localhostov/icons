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

public val Icons.Outline.Bike: ImageVector
    get() {
        if (_bike != null) {
            return _bike!!
        }
        _bike = Builder(name = "Bike", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.783f, 12.079f)
                curveToRelative(-0.164f, -0.586f, -0.349f, -1.206f, -0.555f, -1.873f)
                arcTo(23.043f, 23.043f, 0.0f, false, true, 18.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                arcToRelative(10.641f, 10.641f, 0.0f, false, false, 0.319f, 2.263f)
                lineTo(11.519f, 11.0f)
                lineTo(5.971f, 7.0f)
                lineTo(9.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 5.0f)
                lineTo(5.971f, 5.0f)
                arcTo(1.969f, 1.969f, 0.0f, false, false, 4.809f, 8.559f)
                lineTo(9.88f, 12.271f)
                lineTo(8.442f, 13.39f)
                arcToRelative(4.954f, 4.954f, 0.0f, true, false, 1.15f, 1.638f)
                lineToRelative(7.289f, -5.669f)
                curveToRelative(0.141f, 0.476f, 0.727f, 2.384f, 0.856f, 2.823f)
                arcToRelative(4.994f, 4.994f, 0.0f, true, false, 2.046f, -0.1f)
                close()
                moveTo(5.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 20.0f)
                close()
                moveTo(19.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bike!!
    }

private var _bike: ImageVector? = null
