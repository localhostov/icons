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

public val Icons.Outline.Hotdog: ImageVector
    get() {
        if (_hotdog != null) {
            return _hotdog!!
        }
        _hotdog = Builder(name = "Hotdog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.043f, 12.9f)
                arcTo(3.464f, 3.464f, 0.0f, false, false, 22.926f, 8.0f)
                arcTo(3.523f, 3.523f, 0.0f, false, false, 18.0f, 8.053f)
                arcTo(8.7f, 8.7f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(8.733f, 8.733f, 0.0f, false, true, 6.017f, 8.068f)
                arcTo(3.511f, 3.511f, 0.0f, false, false, 1.1f, 7.956f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.139f, 4.951f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, false, 1.228f, 1.048f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.37f, 7.1f)
                arcTo(18.149f, 18.149f, 0.0f, false, false, 12.0f, 23.0f)
                arcToRelative(18.149f, 18.149f, 0.0f, false, false, 8.443f, -1.941f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.115f, -6.0f)
                arcToRelative(4.518f, 4.518f, 0.0f, false, false, -0.745f, -1.1f)
                arcTo(9.591f, 9.591f, 0.0f, false, false, 23.043f, 12.9f)
                close()
                moveTo(20.857f, 17.827f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, true, -1.278f, 1.424f)
                arcTo(16.3f, 16.3f, 0.0f, false, true, 12.0f, 21.0f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, -7.579f, -1.745f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.159f, -4.51f)
                arcTo(11.36f, 11.36f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(11.36f, 11.36f, 0.0f, false, false, 5.42f, -1.255f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.437f, 3.086f)
                close()
                moveTo(21.592f, 11.527f)
                arcToRelative(9.233f, 9.233f, 0.0f, false, true, -1.577f, 1.238f)
                arcToRelative(4.485f, 4.485f, 0.0f, false, false, -3.459f, 0.175f)
                arcTo(9.316f, 9.316f, 0.0f, false, true, 12.0f, 14.0f)
                arcToRelative(9.316f, 9.316f, 0.0f, false, true, -4.556f, -1.059f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, false, -3.459f, -0.176f)
                arcToRelative(9.253f, 9.253f, 0.0f, false, true, -1.574f, -1.234f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.06f, -2.121f)
                arcTo(1.511f, 1.511f, 0.0f, false, true, 4.6f, 9.474f)
                arcTo(10.661f, 10.661f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(10.727f, 10.727f, 0.0f, false, false, 7.412f, -2.533f)
                arcToRelative(1.516f, 1.516f, 0.0f, false, true, 2.119f, -0.029f)
                arcTo(1.479f, 1.479f, 0.0f, false, true, 21.592f, 11.528f)
                close()
                moveTo(13.0f, 6.0f)
                lineTo(11.0f, 6.0f)
                lineTo(11.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 5.0f)
                lineTo(15.0f, 5.0f)
                lineTo(15.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 4.989f)
                lineTo(7.0f, 4.989f)
                lineTo(7.0f, 1.0f)
                lineTo(9.0f, 1.0f)
                close()
            }
        }
        .build()
        return _hotdog!!
    }

private var _hotdog: ImageVector? = null
