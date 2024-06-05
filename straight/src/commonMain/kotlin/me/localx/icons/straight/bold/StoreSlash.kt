package me.localx.icons.straight.bold

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

public val Icons.Bold.StoreSlash: ImageVector
    get() {
        if (_storeSlash != null) {
            return _storeSlash!!
        }
        _storeSlash = Builder(name = "StoreSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.29f)
                curveToRelative(0.62f, -0.77f, 1.0f, -1.73f, 1.0f, -2.79f)
                lineTo(20.67f, 1.0f)
                lineTo(3.37f, 1.0f)
                lineToRelative(-0.06f, 0.19f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.96f, -1.96f)
                verticalLineToRelative(-6.58f)
                close()
                moveTo(19.99f, 10.65f)
                curveToRelative(-0.08f, 0.76f, -0.72f, 1.35f, -1.49f, 1.35f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.67f)
                curveToRelative(0.0f, 0.06f, -0.02f, 0.12f, -0.03f, 0.18f)
                lineToRelative(-4.85f, -4.85f)
                horizontalLineToRelative(2.88f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.33f)
                lineToRelative(1.66f, 6.65f)
                close()
                moveTo(8.0f, 4.0f)
                verticalLineToRelative(1.88f)
                lineToRelative(-1.88f, -1.88f)
                horizontalLineToRelative(1.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                verticalLineToRelative(-5.05f)
                curveToRelative(0.17f, 0.02f, 0.34f, 0.05f, 0.51f, 0.05f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.99f, 0.0f, 1.91f, -0.33f, 2.65f, -0.88f)
                lineToRelative(-2.2f, -2.2f)
                curveToRelative(-0.15f, 0.05f, -0.3f, 0.08f, -0.46f, 0.08f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.78f, 0.0f, -1.42f, -0.59f, -1.49f, -1.35f)
                lineToRelative(0.34f, -1.35f)
                lineTo(1.89f, 6.83f)
                lineToRelative(-0.83f, 3.3f)
                lineToRelative(-0.04f, 0.36f)
                curveToRelative(0.0f, 1.05f, 0.38f, 2.01f, 0.99f, 2.78f)
                verticalLineToRelative(6.72f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(13.05f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _storeSlash!!
    }

private var _storeSlash: ImageVector? = null
