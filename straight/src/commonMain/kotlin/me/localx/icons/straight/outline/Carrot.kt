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

public val Icons.Outline.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.0f)
                lineTo(20.414f, 5.0f)
                lineToRelative(3.293f, -3.293f)
                lineTo(22.293f, 0.293f)
                lineTo(19.0f, 3.586f)
                lineTo(19.0f, 0.0f)
                lineTo(17.0f, 0.0f)
                lineTo(17.0f, 5.456f)
                arcTo(10.139f, 10.139f, 0.0f, false, false, 14.146f, 3.33f)
                arcTo(3.765f, 3.765f, 0.0f, false, false, 9.723f, 4.378f)
                curveTo(7.31f, 6.791f, 1.708f, 20.1f, 1.077f, 21.615f)
                lineTo(0.139f, 23.861f)
                lineToRelative(2.247f, -0.938f)
                curveToRelative(1.51f, -0.631f, 14.824f, -6.233f, 17.236f, -8.646f)
                arcToRelative(3.766f, 3.766f, 0.0f, false, false, 1.049f, -4.422f)
                arcTo(10.167f, 10.167f, 0.0f, false, false, 18.544f, 7.0f)
                lineTo(24.0f, 7.0f)
                close()
                moveTo(18.208f, 12.863f)
                arcToRelative(12.594f, 12.594f, 0.0f, false, true, -2.363f, 1.568f)
                lineToRelative(-2.388f, -2.388f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(14.0f, 15.416f)
                curveToRelative(-2.916f, 1.5f, -6.784f, 3.259f, -10.113f, 4.7f)
                curveToRelative(0.837f, -1.941f, 1.786f, -4.065f, 2.728f, -6.08f)
                lineTo(8.605f, 16.02f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(-2.491f, -2.49f)
                curveToRelative(0.9f, -1.862f, 1.76f, -3.517f, 2.469f, -4.7f)
                lineToRelative(2.545f, 2.545f)
                lineToRelative(1.414f, -1.414f)
                lineTo(11.174f, 5.76f)
                curveToRelative(0.847f, -0.789f, 1.366f, -0.922f, 2.183f, -0.592f)
                arcToRelative(11.623f, 11.623f, 0.0f, false, true, 3.008f, 2.466f)
                arcToRelative(11.628f, 11.628f, 0.0f, false, true, 2.467f, 3.009f)
                curveTo(19.081f, 11.223f, 19.178f, 11.894f, 18.208f, 12.863f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
