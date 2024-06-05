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

public val Icons.Outline.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                lineTo(11.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 5.0f)
                close()
                moveTo(13.0f, 7.0f)
                lineTo(13.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 13.0f, 7.0f)
                close()
                moveTo(21.918f, 13.509f)
                lineTo(19.82f, 24.0f)
                lineTo(4.18f, 24.0f)
                lineToRelative(-2.1f, -10.491f)
                arcToRelative(3.988f, 3.988f, 0.0f, false, true, -0.055f, -6.976f)
                arcTo(4.007f, 4.007f, 0.0f, false, true, 5.311f, 3.06f)
                arcToRelative(3.456f, 3.456f, 0.0f, false, true, 3.7f, -2.016f)
                arcTo(3.489f, 3.489f, 0.0f, false, true, 14.66f, 2.0f)
                arcToRelative(3.479f, 3.479f, 0.0f, false, true, 2.392f, 1.115f)
                arcTo(3.854f, 3.854f, 0.0f, false, true, 18.0f, 3.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, 3.973f, 3.533f)
                arcToRelative(3.988f, 3.988f, 0.0f, false, true, -0.055f, 6.976f)
                close()
                moveTo(8.369f, 22.0f)
                lineTo(8.0f, 15.991f)
                arcTo(2.015f, 2.015f, 0.0f, false, false, 6.0f, 14.0f)
                lineTo(4.22f, 14.0f)
                lineToRelative(1.6f, 8.0f)
                close()
                moveTo(13.456f, 22.0f)
                lineTo(14.0f, 15.964f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 16.0f)
                lineToRelative(0.372f, 6.0f)
                close()
                moveTo(19.78f, 14.0f)
                lineTo(18.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineToRelative(-0.537f, 6.0f)
                lineTo(18.18f, 22.0f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, false, 0.665f, -3.874f)
                lineTo(20.0f, 7.889f)
                lineTo(20.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.872f, -1.788f)
                lineToRelative(-0.861f, 0.421f)
                lineToRelative(-0.457f, -0.841f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 4.0f)
                curveToRelative(-0.1f, 0.0f, -1.347f, 0.266f, -1.347f, 0.266f)
                lineToRelative(-0.182f, -1.028f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, -2.739f, -0.526f)
                lineToRelative(-0.439f, 0.7f)
                lineToRelative(-0.772f, -0.3f)
                arcTo(1.438f, 1.438f, 0.0f, false, false, 8.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.03f, 4.2f)
                lineToRelative(-0.161f, 0.8f)
                lineTo(5.945f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 7.0f)
                verticalLineToRelative(0.89f)
                lineToRelative(-0.665f, 0.236f)
                arcTo(1.993f, 1.993f, 0.0f, false, false, 4.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, true, 3.0f, 1.357f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, true, 5.994f, -0.006f)
                arcTo(4.027f, 4.027f, 0.0f, false, true, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
