package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = Builder(name = "FlipHorizontal", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.356f, 0.0f)
                lineTo(0.375f, 19.759f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.106f, 24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.046f)
                lineTo(10.993f, 0.0f)
                close()
                moveTo(9.0f, 22.0f)
                horizontalLineTo(3.106f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.911f, -1.414f)
                lineTo(9.0f, 5.616f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.625f, 19.759f)
                lineTo(14.93f, 0.628f)
                lineTo(14.626f, 0.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(7.894f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.731f, -4.241f)
                close()
            }
        }
        .build()
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
