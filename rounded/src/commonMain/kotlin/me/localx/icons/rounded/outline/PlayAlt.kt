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

public val Icons.Outline.PlayAlt: ImageVector
    get() {
        if (_playAlt != null) {
            return _playAlt!!
        }
        _playAlt = Builder(name = "PlayAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 24.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                close()
                moveTo(5.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(9.342f, 17.005f)
                arcToRelative(2.368f, 2.368f, 0.0f, false, true, -1.186f, -0.323f)
                arcToRelative(2.313f, 2.313f, 0.0f, false, true, -1.164f, -2.021f)
                verticalLineToRelative(-5.322f)
                arcToRelative(2.337f, 2.337f, 0.0f, false, true, 3.5f, -2.029f)
                lineToRelative(5.278f, 2.635f)
                arcToRelative(2.336f, 2.336f, 0.0f, false, true, 0.049f, 4.084f)
                lineToRelative(-5.376f, 2.687f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -1.101f, 0.289f)
                close()
                moveTo(9.317f, 9.005f)
                arcToRelative(0.314f, 0.314f, 0.0f, false, false, -0.157f, 0.042f)
                arcToRelative(0.327f, 0.327f, 0.0f, false, false, -0.168f, 0.292f)
                verticalLineToRelative(5.322f)
                arcToRelative(0.337f, 0.337f, 0.0f, false, false, 0.5f, 0.293f)
                lineToRelative(5.376f, -2.688f)
                arcToRelative(0.314f, 0.314f, 0.0f, false, false, 0.12f, -0.266f)
                arcToRelative(0.325f, 0.325f, 0.0f, false, false, -0.169f, -0.292f)
                lineToRelative(-5.274f, -2.635f)
                arcToRelative(0.462f, 0.462f, 0.0f, false, false, -0.228f, -0.068f)
                close()
            }
        }
        .build()
        return _playAlt!!
    }

private var _playAlt: ImageVector? = null
