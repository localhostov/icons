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

public val Icons.Outline.DiceD8: ImageVector
    get() {
        if (_diceD8 != null) {
            return _diceD8!!
        }
        _diceD8 = Builder(name = "DiceD8", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 8.759f)
                lineTo(14.994f, 1.337f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, -0.011f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.987f, 1.34f)
                lineTo(2.169f, 8.784f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 2.2f, 15.248f)
                lineTo(9.023f, 22.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 1.349f)
                horizontalLineToRelative(0.006f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.985f, -1.344f)
                lineToRelative(6.828f, -7.466f)
                arcTo(5.005f, 5.005f, 0.0f, false, false, 21.8f, 8.759f)
                close()
                moveTo(13.5f, 2.676f)
                lineTo(20.291f, 10.076f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, true, 0.624f, 1.244f)
                lineTo(13.0f, 13.662f)
                lineTo(13.0f, 2.257f)
                arcTo(2.052f, 2.052f, 0.0f, false, true, 13.508f, 2.676f)
                close()
                moveTo(10.482f, 2.676f)
                lineTo(10.494f, 2.663f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, true, 0.5f, -0.408f)
                lineTo(10.994f, 13.662f)
                lineTo(3.07f, 11.32f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 0.6f, -1.217f)
                close()
                moveTo(10.501f, 21.331f)
                lineTo(3.7f, 13.928f)
                arcToRelative(3.093f, 3.093f, 0.0f, false, true, -0.3f, -0.424f)
                lineTo(11.0f, 15.747f)
                lineTo(11.0f, 21.74f)
                arcTo(2.085f, 2.085f, 0.0f, false, true, 10.509f, 21.33f)
                close()
                moveTo(13.513f, 21.341f)
                arcToRelative(2.035f, 2.035f, 0.0f, false, true, -0.521f, 0.423f)
                lineTo(12.992f, 15.747f)
                lineTo(20.607f, 13.5f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -0.275f, 0.394f)
                close()
            }
        }
        .build()
        return _diceD8!!
    }

private var _diceD8: ImageVector? = null
