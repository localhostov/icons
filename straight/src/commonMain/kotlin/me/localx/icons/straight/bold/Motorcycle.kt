package me.localx.icons.straight.bold

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

public val Icons.Bold.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) {
            return _motorcycle!!
        }
        _motorcycle = Builder(name = "Motorcycle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.991f, 11.032f)
                curveToRelative(-0.009f, 0.0f, -0.783f, -2.366f, -0.783f, -2.366f)
                arcToRelative(13.874f, 13.874f, 0.0f, false, true, 1.461f, -0.134f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, 1.322f, 0.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -1.322f, 0.5f)
                arcToRelative(23.489f, 23.489f, 0.0f, false, false, -2.389f, 0.233f)
                lineTo(16.086f, 2.032f)
                lineTo(10.991f, 2.032f)
                verticalLineToRelative(3.0f)
                lineTo(13.9f, 5.032f)
                lineToRelative(0.6f, 1.882f)
                arcToRelative(6.478f, 6.478f, 0.0f, false, false, -1.2f, 1.118f)
                lineTo(8.65f, 8.032f)
                curveToRelative(0.0f, 0.005f, 0.0f, 0.011f, 0.0f, 0.0f)
                arcToRelative(3.591f, 3.591f, 0.0f, false, false, -3.162f, -2.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.482f, 0.482f, 0.0f, false, true, 0.447f, 0.276f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, true, -0.071f, 0.559f)
                lineToRelative(-0.825f, 1.166f)
                lineTo(4.99f, 11.033f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                arcToRelative(5.078f, 5.078f, 0.0f, false, false, 5.0f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.769f, -3.5f)
                arcToRelative(3.475f, 3.475f, 0.0f, false, false, 1.045f, -0.956f)
                lineToRelative(4.7f, -6.51f)
                lineToRelative(0.6f, 1.877f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 2.882f, -0.916f)
                close()
                moveTo(8.374f, 14.825f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.406f, 0.207f)
                lineTo(5.884f, 15.032f)
                lineToRelative(2.4f, -3.4f)
                arcToRelative(3.672f, 3.672f, 0.0f, false, false, 0.363f, -0.6f)
                horizontalLineToRelative(2.462f)
                close()
                moveTo(18.991f, 18.032f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.991f, 18.032f)
                close()
            }
        }
        .build()
        return _motorcycle!!
    }

private var _motorcycle: ImageVector? = null
