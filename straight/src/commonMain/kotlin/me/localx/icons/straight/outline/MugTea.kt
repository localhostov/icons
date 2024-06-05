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

public val Icons.Outline.MugTea: ImageVector
    get() {
        if (_mugTea != null) {
            return _mugTea!!
        }
        _mugTea = Builder(name = "MugTea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.564f, 12.143f)
                curveToRelative(0.178f, -0.9f, 0.323f, -1.837f, 0.42f, -2.81f)
                arcToRelative(3.051f, 3.051f, 0.0f, false, false, -0.771f, -2.346f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 18.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, false, -2.215f, 0.984f)
                arcTo(3.047f, 3.047f, 0.0f, false, false, 0.016f, 9.33f)
                arcTo(31.3f, 31.3f, 0.0f, false, false, 5.194f, 23.592f)
                lineToRelative(0.3f, 0.408f)
                lineTo(15.507f, 24.0f)
                lineToRelative(0.3f, -0.408f)
                arcTo(23.048f, 23.048f, 0.0f, false, false, 17.386f, 21.0f)
                lineTo(19.0f, 21.0f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, false, 5.0f, -5.0f)
                curveTo(24.0f, 13.946f, 22.743f, 12.571f, 20.564f, 12.143f)
                close()
                moveTo(10.0f, 13.414f)
                lineTo(10.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 13.414f)
                lineToRelative(1.0f, -1.0f)
                close()
                moveTo(14.471f, 22.0f)
                lineTo(6.529f, 22.0f)
                arcTo(30.171f, 30.171f, 0.0f, false, true, 2.006f, 9.131f)
                arcToRelative(1.044f, 1.044f, 0.0f, false, true, 0.262f, -0.8f)
                arcTo(0.978f, 0.978f, 0.0f, false, true, 3.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(2.585f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                lineTo(12.0f, 12.586f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(10.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, true, 0.733f, 0.327f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, true, 0.262f, 0.8f)
                arcTo(30.174f, 30.174f, 0.0f, false, true, 14.471f, 22.0f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-0.634f)
                arcToRelative(32.654f, 32.654f, 0.0f, false, false, 1.747f, -4.915f)
                curveTo(22.0f, 14.41f, 22.0f, 15.576f, 22.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 19.0f)
                close()
                moveTo(11.026f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.026f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(15.026f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.026f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.026f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.026f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _mugTea!!
    }

private var _mugTea: ImageVector? = null
