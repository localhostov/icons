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

public val Icons.Outline.Volcano: ImageVector
    get() {
        if (_volcano != null) {
            return _volcano!!
        }
        _volcano = Builder(name = "Volcano", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.971f, 10.0f)
                lineTo(9.029f, 10.0f)
                lineTo(0.0f, 22.678f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 22.59f)
                close()
                moveTo(10.057f, 12.0f)
                horizontalLineToRelative(3.886f)
                lineToRelative(1.477f, 2.058f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -1.42f, 0.708f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, false, -4.0f, 0.0f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -1.42f, -0.708f)
                close()
                moveTo(2.884f, 22.0f)
                lineToRelative(4.3f, -6.0f)
                lineTo(8.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(0.812f)
                lineToRelative(4.3f, 6.0f)
                close()
                moveTo(2.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.527f, 3.037f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 1.0f)
                arcToRelative(3.867f, 3.867f, 0.0f, false, true, 1.169f, 0.181f)
                arcToRelative(3.984f, 3.984f, 0.0f, false, true, 5.662f, 0.0f)
                arcTo(3.867f, 3.867f, 0.0f, false, true, 16.0f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.473f, 2.037f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 9.0f)
                arcToRelative(2.971f, 2.971f, 0.0f, false, true, -1.38f, -0.342f)
                arcTo(3.987f, 3.987f, 0.0f, false, true, 16.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, false, 1.116f, -0.34f)
                lineToRelative(0.645f, -0.436f)
                lineToRelative(0.58f, 0.518f)
                arcTo(0.991f, 0.991f, 0.0f, false, false, 19.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineToRelative(-0.777f, 0.07f)
                lineToRelative(-0.345f, -0.723f)
                arcTo(1.99f, 1.99f, 0.0f, false, false, 15.021f, 3.27f)
                lineToRelative(-0.828f, 0.469f)
                lineToRelative(-0.508f, -0.8f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, false, -3.37f, 0.0f)
                lineToRelative(-0.508f, 0.8f)
                lineTo(8.979f, 3.27f)
                arcTo(1.989f, 1.989f, 0.0f, false, false, 6.122f, 4.347f)
                lineToRelative(-0.257f, 0.737f)
                lineTo(4.977f, 5.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.683f, 1.741f)
                lineToRelative(0.58f, -0.518f)
                lineToRelative(0.645f, 0.436f)
                arcTo(1.993f, 1.993f, 0.0f, false, false, 8.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, true, -1.62f, -0.342f)
                arcTo(2.971f, 2.971f, 0.0f, false, true, 5.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 6.0f)
                close()
            }
        }
        .build()
        return _volcano!!
    }

private var _volcano: ImageVector? = null
