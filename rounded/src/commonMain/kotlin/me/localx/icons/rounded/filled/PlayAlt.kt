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

public val Icons.Filled.PlayAlt: ImageVector
    get() {
        if (_playAlt != null) {
            return _playAlt!!
        }
        _playAlt = Builder(name = "PlayAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.823f, 11.708f)
                arcToRelative(0.325f, 0.325f, 0.0f, false, true, 0.169f, 0.292f)
                arcToRelative(0.314f, 0.314f, 0.0f, false, true, -0.12f, 0.266f)
                lineToRelative(-5.372f, 2.688f)
                arcToRelative(0.337f, 0.337f, 0.0f, false, true, -0.5f, -0.293f)
                verticalLineToRelative(-5.322f)
                arcToRelative(0.327f, 0.327f, 0.0f, false, true, 0.168f, -0.292f)
                arcToRelative(0.314f, 0.314f, 0.0f, false, true, 0.157f, -0.042f)
                arcToRelative(0.462f, 0.462f, 0.0f, false, true, 0.228f, 0.068f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                close()
                moveTo(16.992f, 12.0f)
                arcToRelative(2.332f, 2.332f, 0.0f, false, false, -1.226f, -2.055f)
                lineToRelative(-5.278f, -2.635f)
                arcToRelative(2.337f, 2.337f, 0.0f, false, false, -3.5f, 2.029f)
                verticalLineToRelative(5.322f)
                arcToRelative(2.313f, 2.313f, 0.0f, false, false, 1.164f, 2.021f)
                arcToRelative(2.368f, 2.368f, 0.0f, false, false, 1.186f, 0.323f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 1.1f, -0.289f)
                lineToRelative(5.376f, -2.687f)
                arcToRelative(2.313f, 2.313f, 0.0f, false, false, 1.178f, -2.029f)
                close()
            }
        }
        .build()
        return _playAlt!!
    }

private var _playAlt: ImageVector? = null
