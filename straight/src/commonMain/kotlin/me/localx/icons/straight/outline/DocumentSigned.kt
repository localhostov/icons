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

public val Icons.Outline.DocumentSigned: ImageVector
    get() {
        if (_documentSigned != null) {
            return _documentSigned!!
        }
        _documentSigned = Builder(name = "DocumentSigned", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 6.243f)
                arcToRelative(3.975f, 3.975f, 0.0f, false, false, -1.172f, -2.829f)
                lineToRelative(-2.242f, -2.242f)
                arcToRelative(4.022f, 4.022f, 0.0f, false, false, -2.828f, -1.172f)
                horizontalLineToRelative(-8.758f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(18.414f, 4.828f)
                arcToRelative(1.923f, 1.923f, 0.0f, false, true, 0.141f, 0.172f)
                horizontalLineToRelative(-2.555f)
                verticalLineToRelative(-2.555f)
                arcToRelative(1.923f, 1.923f, 0.0f, false, true, 0.172f, 0.141f)
                close()
                moveTo(5.0f, 22.0f)
                verticalLineToRelative(-19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(14.018f, 16.814f)
                lineTo(15.983f, 17.18f)
                curveToRelative(-0.191f, 1.047f, -1.005f, 2.82f, -2.848f, 2.82f)
                arcToRelative(3.154f, 3.154f, 0.0f, false, true, -1.986f, -0.706f)
                curveToRelative(-0.314f, -0.223f, -0.424f, -0.294f, -0.662f, -0.294f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, false, -0.916f, 0.66f)
                lineToRelative(-1.5f, -1.317f)
                arcToRelative(3.749f, 3.749f, 0.0f, false, true, 2.416f, -1.343f)
                arcToRelative(2.925f, 2.925f, 0.0f, false, true, 1.821f, 0.664f)
                arcToRelative(1.235f, 1.235f, 0.0f, false, false, 0.827f, 0.336f)
                curveToRelative(0.623f, 0.0f, 0.88f, -1.173f, 0.883f, -1.186f)
                close()
            }
        }
        .build()
        return _documentSigned!!
    }

private var _documentSigned: ImageVector? = null
