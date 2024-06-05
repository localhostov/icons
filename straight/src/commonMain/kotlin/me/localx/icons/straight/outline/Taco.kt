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

public val Icons.Outline.Taco: ImageVector
    get() {
        if (_taco != null) {
            return _taco!!
        }
        _taco = Builder(name = "Taco", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 15.0f)
                close()
                moveTo(15.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 17.0f)
                close()
                moveTo(18.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 18.0f)
                close()
                moveTo(23.118f, 10.894f)
                arcTo(9.949f, 9.949f, 0.0f, false, true, 24.0f, 15.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(3.0f, 23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(0.0f, 15.0f)
                arcTo(9.963f, 9.963f, 0.0f, false, true, 2.193f, 8.779f)
                arcToRelative(17.513f, 17.513f, 0.0f, false, false, 0.712f, 2.533f)
                arcTo(7.993f, 7.993f, 0.0f, false, false, 2.0f, 15.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(4.0f, 15.0f)
                arcToRelative(9.949f, 9.949f, 0.0f, false, true, 0.882f, -4.106f)
                arcTo(12.567f, 12.567f, 0.0f, false, true, 4.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.311f, 3.06f)
                arcToRelative(3.543f, 3.543f, 0.0f, false, true, 3.957f, -1.972f)
                arcToRelative(3.974f, 3.974f, 0.0f, false, true, 5.464f, 0.0f)
                arcTo(3.421f, 3.421f, 0.0f, false, true, 17.5f, 1.0f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, true, 3.189f, 2.06f)
                arcTo(4.007f, 4.007f, 0.0f, false, true, 24.0f, 7.0f)
                arcTo(12.56f, 12.56f, 0.0f, false, true, 23.118f, 10.894f)
                close()
                moveTo(6.266f, 8.668f)
                arcToRelative(9.987f, 9.987f, 0.0f, false, true, 15.468f, 0.0f)
                arcTo(6.989f, 6.989f, 0.0f, false, false, 22.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.941f, -2.0f)
                lineToRelative(-0.928f, 0.0f)
                lineToRelative(-0.161f, -0.8f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.112f, -1.05f)
                lineToRelative(-0.753f, 0.36f)
                lineToRelative(-0.488f, -0.677f)
                arcToRelative(2.041f, 2.041f, 0.0f, false, false, -3.234f, 0.0f)
                lineToRelative(-0.488f, 0.677f)
                lineToRelative(-0.754f, -0.36f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.03f, 4.2f)
                lineToRelative(-0.161f, 0.8f)
                lineTo(7.945f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 7.0f)
                arcTo(6.973f, 6.973f, 0.0f, false, false, 6.266f, 8.668f)
                close()
                moveTo(22.0f, 15.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 6.0f, 15.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, true, -0.171f, 1.0f)
                lineTo(21.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _taco!!
    }

private var _taco: ImageVector? = null
