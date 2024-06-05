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

public val Icons.Outline.Floor: ImageVector
    get() {
        if (_floor != null) {
            return _floor!!
        }
        _floor = Builder(name = "Floor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.017f, 7.497f)
                lineTo(12.0f, 0.075f)
                lineTo(-0.017f, 7.497f)
                lineToRelative(12.017f, 7.422f)
                lineToRelative(12.017f, -7.422f)
                close()
                moveTo(8.793f, 10.587f)
                lineToRelative(4.235f, -2.6f)
                lineToRelative(3.204f, 1.967f)
                lineToRelative(-4.231f, 2.614f)
                lineToRelative(-3.208f, -1.981f)
                close()
                moveTo(18.137f, 8.778f)
                lineToRelative(-3.199f, -1.964f)
                lineToRelative(2.09f, -1.283f)
                lineToRelative(3.182f, 1.966f)
                lineToRelative(-2.073f, 1.281f)
                close()
                moveTo(15.123f, 4.354f)
                lineToRelative(-4.283f, 2.63f)
                lineToRelative(-3.119f, -1.915f)
                lineToRelative(4.28f, -2.644f)
                lineToRelative(3.122f, 1.929f)
                close()
                moveTo(5.815f, 6.246f)
                lineToRelative(3.113f, 1.911f)
                lineToRelative(-2.041f, 1.253f)
                lineToRelative(-3.098f, -1.913f)
                lineToRelative(2.025f, -1.251f)
                close()
                moveTo(12.001f, 17.072f)
                lineToRelative(12.0f, -7.412f)
                verticalLineToRelative(2.35f)
                lineToRelative(-12.0f, 7.412f)
                lineTo(0.0f, 12.01f)
                verticalLineToRelative(-2.35f)
                lineToRelative(12.0f, 7.412f)
                close()
                moveTo(12.001f, 21.569f)
                lineToRelative(12.0f, -7.412f)
                verticalLineToRelative(2.35f)
                lineToRelative(-12.0f, 7.412f)
                lineTo(0.0f, 16.507f)
                verticalLineToRelative(-2.35f)
                lineToRelative(12.0f, 7.412f)
                close()
            }
        }
        .build()
        return _floor!!
    }

private var _floor: ImageVector? = null
