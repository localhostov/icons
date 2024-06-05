package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Guitar: ImageVector
    get() {
        if (_guitar != null) {
            return _guitar!!
        }
        _guitar = Builder(name = "Guitar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0423f, 17.4572f)
                lineToRelative(1.4142f, -1.4142f)
                lineToRelative(2.5003f, 2.5003f)
                lineToRelative(-1.4142f, 1.4142f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 5.0f)
                lineToRelative(1.982f, -1.982f)
                arcToRelative(1.768f, 1.768f, 0.0f, false, false, -2.5f, -2.5f)
                lineTo(19.0f, 2.5f)
                lineTo(19.0f, 3.652f)
                lineTo(16.279f, 6.343f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -7.719f, 0.215f)
                arcTo(5.023f, 5.023f, 0.0f, false, false, 7.6f, 7.9f)
                arcToRelative(0.256f, 0.256f, 0.0f, false, true, -0.133f, 0.106f)
                arcToRelative(7.171f, 7.171f, 0.0f, false, false, -5.4f, 2.056f)
                curveToRelative(-2.956f, 2.957f, -2.7f, 8.025f, 0.575f, 11.3f)
                arcTo(8.8f, 8.8f, 0.0f, false, false, 8.814f, 24.0f)
                arcToRelative(7.048f, 7.048f, 0.0f, false, false, 7.178f, -7.461f)
                arcToRelative(0.168f, 0.168f, 0.0f, false, true, 0.1f, -0.133f)
                arcToRelative(5.024f, 5.024f, 0.0f, false, false, 1.345f, -0.96f)
                arcTo(5.894f, 5.894f, 0.0f, false, false, 17.69f, 7.76f)
                lineTo(20.481f, 5.0f)
                close()
                moveTo(16.026f, 14.028f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, -0.815f, 0.579f)
                arcToRelative(2.161f, 2.161f, 0.0f, false, false, -1.217f, 2.0f)
                arcToRelative(5.193f, 5.193f, 0.0f, false, true, -1.473f, 3.917f)
                curveToRelative(-2.175f, 2.175f, -5.975f, 1.92f, -8.468f, -0.574f)
                reflectiveCurveTo(1.3f, 13.655f, 3.479f, 11.479f)
                arcTo(5.161f, 5.161f, 0.0f, false, true, 7.183f, 10.0f)
                curveToRelative(0.071f, 0.0f, 0.142f, 0.0f, 0.214f, 0.0f)
                arcToRelative(2.138f, 2.138f, 0.0f, false, false, 2.0f, -1.219f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, true, 0.579f, -0.814f)
                arcToRelative(3.863f, 3.863f, 0.0f, false, true, 4.87f, -0.21f)
                lineToRelative(-1.8f, 1.776f)
                lineToRelative(1.406f, 1.422f)
                lineToRelative(1.8f, -1.779f)
                arcTo(3.855f, 3.855f, 0.0f, false, true, 16.026f, 14.028f)
                close()
            }
        }
        .build()
        return _guitar!!
    }

private var _guitar: ImageVector? = null
