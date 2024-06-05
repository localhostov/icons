package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

public val Icons.Outline.CrossCircle: ImageVector
    get() {
        if (_crossCircle != null) {
            return _crossCircle!!
        }
        _crossCircle = Builder(name = "CrossCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(12.0f, 10.586f)
                lineTo(9.414f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 9.414f)
                lineTo(10.586f, 12.0f)
                lineTo(8.0f, 14.586f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.414f, 16.0f)
                lineTo(12.0f, 13.414f)
                lineTo(14.586f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 14.586f)
                lineTo(13.414f, 12.0f)
                lineTo(16.0f, 9.414f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _crossCircle!!
    }

private var _crossCircle: ImageVector? = null
