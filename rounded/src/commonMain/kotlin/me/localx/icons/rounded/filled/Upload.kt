package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.008f, viewportHeight = 512.008f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.399f, 117.448f)
                lineToRelative(62.421f, -62.443f)
                lineToRelative(-0.149f, 329.344f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                lineToRelative(0.149f, -328.981f)
                lineToRelative(62.123f, 62.144f)
                curveToRelative(8.475f, 8.185f, 21.98f, 7.951f, 30.165f, -0.524f)
                curveToRelative(7.985f, -8.267f, 7.985f, -21.374f, 0.0f, -29.641f)
                lineTo(301.273f, 18.76f)
                curveToRelative(-24.986f, -25.002f, -65.508f, -25.015f, -90.51f, -0.029f)
                curveToRelative(-0.01f, 0.01f, -0.019f, 0.019f, -0.029f, 0.029f)
                lineToRelative(-68.501f, 68.523f)
                curveToRelative(-8.185f, 8.475f, -7.951f, 21.98f, 0.524f, 30.165f)
                curveTo(151.024f, 125.433f, 164.131f, 125.433f, 172.399f, 117.448f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.671f, 341.341f)
                lineTo(490.671f, 341.341f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                verticalLineToRelative(85.333f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                horizontalLineToRelative(-384.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                verticalLineToRelative(-85.333f)
                curveToRelative(0.0f, -11.782f, -9.551f, -21.333f, -21.333f, -21.333f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                verticalLineToRelative(85.333f)
                curveToRelative(0.0f, 35.346f, 28.654f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(35.346f, 0.0f, 64.0f, -28.654f, 64.0f, -64.0f)
                verticalLineToRelative(-85.333f)
                curveTo(512.004f, 350.892f, 502.453f, 341.341f, 490.671f, 341.341f)
                close()
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null
