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

public val Icons.Outline.ArrowsHCopy: ImageVector
    get() {
        if (_arrowsHCopy != null) {
            return _arrowsHCopy!!
        }
        _arrowsHCopy = Builder(name = "ArrowsHCopy", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.332f, 18.253f)
                lineToRelative(-2.885f, 2.835f)
                curveToRelative(-0.108f, 0.108f, -0.255f, 0.245f, -0.414f, 0.389f)
                verticalLineTo(2.522f)
                curveToRelative(0.16f, 0.146f, 0.308f, 0.283f, 0.42f, 0.4f)
                lineToRelative(2.879f, 2.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, -1.426f)
                lineTo(14.861f, 1.5f)
                curveToRelative(-0.2f, -0.2f, -0.513f, -0.486f, -0.84f, -0.776f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.976f, 0.0f)
                curveToRelative(-0.327f, 0.289f, -0.637f, 0.573f, -0.834f, 0.77f)
                lineTo(6.332f, 4.319f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 1.426f)
                lineToRelative(2.885f, -2.834f)
                curveToRelative(0.108f, -0.108f, 0.255f, -0.244f, 0.414f, -0.389f)
                verticalLineTo(21.477f)
                curveToRelative(-0.16f, -0.146f, -0.309f, -0.284f, -0.42f, -0.4f)
                lineTo(7.734f, 18.253f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.427f)
                lineTo(9.205f, 22.5f)
                curveToRelative(0.2f, 0.2f, 0.513f, 0.487f, 0.84f, 0.777f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 1.982f, 0.752f)
                horizontalLineToRelative(0.012f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, 1.983f, -0.754f)
                curveToRelative(0.326f, -0.289f, 0.636f, -0.572f, 0.833f, -0.769f)
                lineToRelative(2.879f, -2.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -1.427f)
                close()
            }
        }
        .build()
        return _arrowsHCopy!!
    }

private var _arrowsHCopy: ImageVector? = null
