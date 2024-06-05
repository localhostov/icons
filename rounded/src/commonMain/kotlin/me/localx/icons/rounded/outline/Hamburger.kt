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

public val Icons.Outline.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 14.006f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, false, -1.0f, -2.219f)
                verticalLineTo(10.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 13.0f, 0.0f)
                horizontalLineTo(11.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 1.0f, 10.0f)
                verticalLineToRelative(1.837f)
                arcTo(3.137f, 3.137f, 0.0f, false, false, 1.0f, 16.4f)
                verticalLineTo(17.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, 7.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, 7.0f, -7.0f)
                verticalLineToRelative(-0.774f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 24.0f, 14.006f)
                close()
                moveTo(2.812f, 15.158f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 0.282f, -2.152f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveToRelative(-1.956f, 0.0f, -3.979f, 0.788f, -6.364f, 2.481f)
                arcToRelative(2.867f, 2.867f, 0.0f, false, true, -3.271f, 0.0f)
                curveToRelative(-0.228f, -0.162f, -0.447f, -0.331f, -0.667f, -0.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 2.812f, 15.158f)
                close()
                moveTo(3.0f, 10.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(1.006f)
                lineToRelative(-18.0f, 0.01f)
                close()
                moveTo(16.0f, 22.0f)
                horizontalLineTo(8.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, true, -4.975f, -4.755f)
                arcToRelative(6.24f, 6.24f, 0.0f, false, true, 2.454f, 1.327f)
                curveToRelative(0.239f, 0.185f, 0.479f, 0.369f, 0.729f, 0.546f)
                arcToRelative(4.893f, 4.893f, 0.0f, false, false, 5.584f, 0.0f)
                arcTo(9.385f, 9.385f, 0.0f, false, true, 17.0f, 17.006f)
                horizontalLineToRelative(4.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 22.0f)
                close()
                moveTo(9.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 5.0f)
                close()
                moveTo(6.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 8.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
