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

public val Icons.Filled.CrossCircle: ImageVector
    get() {
        if (_crossCircle != null) {
            return _crossCircle!!
        }
        _crossCircle = Builder(name = "CrossCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(16.707f, 15.293f)
                lineTo(15.293f, 16.707f)
                lineTo(12.0f, 13.414f)
                lineTo(8.707f, 16.707f)
                lineTo(7.293f, 15.293f)
                lineTo(10.586f, 12.0f)
                lineTo(7.293f, 8.707f)
                lineTo(8.707f, 7.293f)
                lineTo(12.0f, 10.586f)
                lineToRelative(3.293f, -3.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.414f, 12.0f)
                close()
            }
        }
        .build()
        return _crossCircle!!
    }

private var _crossCircle: ImageVector? = null
