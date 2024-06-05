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

public val Icons.Outline.PlayingCards: ImageVector
    get() {
        if (_playingCards != null) {
            return _playingCards!!
        }
        _playingCards = Builder(name = "PlayingCards", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.85f, 2.977f)
                lineToRelative(-9.436f, -2.856f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.714f, 2.031f)
                lineToRelative(-0.559f, 1.848f)
                horizontalLineToRelative(-5.141f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.045f)
                lineToRelative(3.1f, 1.152f)
                lineToRelative(4.78f, -16.414f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.03f, -3.716f)
                close()
                moveTo(14.0f, 22.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(21.96f, 6.134f)
                lineTo(17.78f, 20.483f)
                lineTo(16.0f, 19.82f)
                verticalLineToRelative(-12.82f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-2.77f)
                lineToRelative(0.384f, -1.28f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, 0.479f, -0.6f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, 0.751f, -0.086f)
                lineToRelative(9.435f, 2.856f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.681f, 1.244f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(0.0f, 2.333f, -4.0f, 5.0f, -4.0f, 5.0f)
                reflectiveCurveToRelative(-4.0f, -2.667f, -4.0f, -5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _playingCards!!
    }

private var _playingCards: ImageVector? = null
