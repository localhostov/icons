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

public val Icons.Bold.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.866f, 7.987f)
                lineToRelative(2.143f, -2.1f)
                lineToRelative(-5.75f, -5.874f)
                lineToRelative(-2.143f, 2.1f)
                lineToRelative(1.894f, 1.934f)
                lineToRelative(-1.65f, 1.535f)
                lineToRelative(-0.56f, -0.557f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.949f, 0.0f)
                lineToRelative(-7.851f, 7.854f)
                verticalLineToRelative(6.0f)
                lineToRelative(-3.061f, 3.06f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(3.06f, -3.061f)
                horizontalLineToRelative(6.0f)
                lineToRelative(7.854f, -7.854f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -4.949f)
                lineToRelative(-0.492f, -0.492f)
                lineToRelative(1.626f, -1.513f)
                close()
                moveTo(16.854f, 11.025f)
                lineTo(9.879f, 18.0f)
                horizontalLineToRelative(-3.879f)
                verticalLineToRelative(-3.8f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.438f, -2.44f)
                lineToRelative(1.648f, -1.649f)
                lineToRelative(2.439f, 2.44f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(-2.44f, -2.439f)
                lineToRelative(1.123f, -1.123f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                lineToRelative(3.172f, 3.172f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.707f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
