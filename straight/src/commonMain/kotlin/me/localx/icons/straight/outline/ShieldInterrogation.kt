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

public val Icons.Outline.ShieldInterrogation: ImageVector
    get() {
        if (_shieldInterrogation != null) {
            return _shieldInterrogation!!
        }
        _shieldInterrogation = Builder(name = "ShieldInterrogation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.937f, 8.283f)
                arcToRelative(4.021f, 4.021f, 0.0f, false, true, -2.009f, 4.222f)
                arcTo(2.345f, 2.345f, 0.0f, false, false, 13.0f, 14.257f)
                lineTo(13.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                verticalLineToRelative(-0.743f)
                arcToRelative(4.311f, 4.311f, 0.0f, false, true, 1.962f, -3.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.005f, -2.125f)
                arcToRelative(2.024f, 2.024f, 0.0f, false, false, -1.6f, -1.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                arcTo(3.991f, 3.991f, 0.0f, false, true, 9.429f, 5.936f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.508f, 2.347f)
                close()
                moveTo(22.0f, 5.467f)
                verticalLineToRelative(6.524f)
                curveToRelative(0.0f, 7.437f, -7.047f, 10.849f, -9.207f, 11.717f)
                lineToRelative(-0.835f, 0.336f)
                lineToRelative(-0.8f, -0.4f)
                curveTo(9.005f, 22.567f, 2.0f, 18.554f, 2.0f, 11.991f)
                lineTo(2.0f, 5.467f)
                arcTo(2.992f, 2.992f, 0.0f, false, true, 4.054f, 2.625f)
                lineTo(12.0f, -0.01f)
                lineToRelative(7.946f, 2.635f)
                arcTo(2.992f, 2.992f, 0.0f, false, true, 22.0f, 5.467f)
                close()
                moveTo(20.0f, 5.467f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.684f, -0.944f)
                lineTo(12.0f, 2.1f)
                lineTo(4.684f, 4.523f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 5.467f)
                verticalLineToRelative(6.524f)
                curveToRelative(0.0f, 5.416f, 6.159f, 8.917f, 8.047f, 9.862f)
                curveTo(13.913f, 21.1f, 20.0f, 18.174f, 20.0f, 11.991f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 17.0f)
                lineTo(11.0f, 17.0f)
                close()
            }
        }
        .build()
        return _shieldInterrogation!!
    }

private var _shieldInterrogation: ImageVector? = null
