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

public val Icons.Filled.Poo: ImageVector
    get() {
        if (_poo != null) {
            return _poo!!
        }
        _poo = Builder(name = "Poo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.113f, 14.484f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, false, -1.457f, -6.116f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.266f, -2.032f)
                arcTo(3.169f, 3.169f, 0.0f, false, false, 16.8f, 4.0f)
                horizontalLineToRelative(-0.942f)
                arcTo(6.778f, 6.778f, 0.0f, false, false, 13.2f, 0.107f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, false, -1.266f, 0.645f)
                arcTo(5.906f, 5.906f, 0.0f, false, true, 10.5f, 4.0f)
                lineTo(7.2f, 4.0f)
                arcTo(3.169f, 3.169f, 0.0f, false, false, 4.078f, 6.336f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.266f, 2.032f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, false, -1.457f, 6.116f)
                curveTo(-1.986f, 16.8f, -0.251f, 24.014f, 5.211f, 24.0f)
                lineTo(17.616f, 24.0f)
                curveTo(24.247f, 24.289f, 26.24f, 17.164f, 21.113f, 14.484f)
                close()
                moveTo(14.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 11.0f)
                close()
                moveTo(9.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 11.0f)
                close()
                moveTo(17.666f, 16.746f)
                arcToRelative(8.376f, 8.376f, 0.0f, false, true, -11.332f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.332f, -1.492f)
                arcToRelative(6.359f, 6.359f, 0.0f, false, false, 8.67f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.33f, 1.493f)
                close()
            }
        }
        .build()
        return _poo!!
    }

private var _poo: ImageVector? = null
