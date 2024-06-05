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

public val Icons.Outline.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) {
            return _flowerTulip!!
        }
        _flowerTulip = Builder(name = "FlowerTulip", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.867f, 14.0f)
                arcTo(11.623f, 11.623f, 0.0f, false, false, 13.0f, 18.783f)
                verticalLineTo(13.919f)
                arcTo(6.015f, 6.015f, 0.0f, false, false, 18.0f, 8.0f)
                curveToRelative(0.0f, -2.8f, -1.944f, -5.159f, -3.844f, -7.1f)
                arcToRelative(3.083f, 3.083f, 0.0f, false, false, -4.313f, 0.0f)
                curveTo(7.943f, 2.836f, 6.0f, 5.2f, 6.0f, 8.0f)
                arcToRelative(6.015f, 6.015f, 0.0f, false, false, 5.0f, 5.924f)
                verticalLineToRelative(4.864f)
                arcTo(11.623f, 11.623f, 0.0f, false, false, 1.133f, 14.0f)
                horizontalLineTo(0.0f)
                lineToRelative(0.141f, 1.126f)
                curveToRelative(0.787f, 6.308f, 6.718f, 8.451f, 10.613f, 8.825f)
                arcToRelative(16.452f, 16.452f, 0.0f, false, false, 2.492f, 0.0f)
                curveToRelative(3.895f, -0.373f, 9.825f, -2.516f, 10.613f, -8.825f)
                lineTo(24.0f, 14.0f)
                close()
                moveTo(2.361f, 16.061f)
                arcToRelative(9.625f, 9.625f, 0.0f, false, true, 8.187f, 5.84f)
                curveTo(8.162f, 21.594f, 3.585f, 20.434f, 2.361f, 16.061f)
                close()
                moveTo(8.0f, 8.0f)
                curveToRelative(0.0f, -2.076f, 1.81f, -4.176f, 3.428f, -5.829f)
                arcTo(21.4f, 21.4f, 0.0f, false, false, 10.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(19.475f, 19.475f, 0.0f, false, true, 1.293f, -6.108f)
                curveTo(14.71f, 4.411f, 16.0f, 6.162f, 16.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 8.0f, 8.0f)
                close()
                moveTo(13.452f, 21.9f)
                arcToRelative(9.627f, 9.627f, 0.0f, false, true, 8.187f, -5.84f)
                curveTo(20.415f, 20.434f, 15.838f, 21.594f, 13.452f, 21.9f)
                close()
            }
        }
        .build()
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
