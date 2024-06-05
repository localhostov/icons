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
                moveTo(23.0f, 5.0f)
                lineTo(20.414f, 5.0f)
                lineToRelative(2.293f, -2.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineTo(19.0f, 3.586f)
                lineTo(19.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(17.0f, 5.456f)
                arcTo(10.139f, 10.139f, 0.0f, false, false, 14.146f, 3.33f)
                arcTo(3.765f, 3.765f, 0.0f, false, false, 9.723f, 4.378f)
                curveTo(7.965f, 6.136f, 3.065f, 15.121f, 0.3f, 20.319f)
                arcTo(2.511f, 2.511f, 0.0f, false, false, 3.681f, 23.7f)
                curveToRelative(5.2f, -2.764f, 14.183f, -7.665f, 15.941f, -9.423f)
                arcToRelative(3.766f, 3.766f, 0.0f, false, false, 1.049f, -4.422f)
                arcTo(10.167f, 10.167f, 0.0f, false, false, 18.544f, 7.0f)
                lineTo(23.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 5.0f)
                close()
                moveTo(18.208f, 12.863f)
                arcTo(16.072f, 16.072f, 0.0f, false, true, 15.915f, 14.5f)
                lineToRelative(-2.208f, -2.207f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(1.87f, 1.869f)
                curveToRelative(-2.746f, 1.643f, -6.689f, 3.842f, -11.421f, 6.358f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.676f, -0.676f)
                curveToRelative(1.522f, -2.861f, 2.923f, -5.424f, 4.16f, -7.618f)
                lineToRelative(2.067f, 2.067f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                lineTo(7.251f, 11.837f)
                curveToRelative(1.09f, -1.889f, 2.006f, -3.4f, 2.709f, -4.463f)
                lineToRelative(2.333f, 2.333f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
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
