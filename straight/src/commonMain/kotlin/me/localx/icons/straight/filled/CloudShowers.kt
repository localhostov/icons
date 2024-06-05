package me.localx.icons.straight.filled

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

public val Icons.Filled.CloudShowers: ImageVector
    get() {
        if (_cloudShowers != null) {
            return _cloudShowers!!
        }
        _cloudShowers = Builder(name = "CloudShowers", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 24.0f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(7.0f)
                lineTo(7.0f, 24.0f)
                close()
                moveTo(19.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 12.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -3.0f, 6.0f)
                lineTo(21.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(17.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(13.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(9.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(5.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(2.4f)
                curveToRelative(-3.55f, -1.626f, -4.042f, -7.147f, -0.735f, -9.348f)
                curveTo(-0.07f, 0.2f, 13.616f, -4.039f, 17.441f, 5.059f)
                arcTo(7.461f, 7.461f, 0.0f, false, true, 24.0f, 12.5f)
                close()
            }
        }
        .build()
        return _cloudShowers!!
    }

private var _cloudShowers: ImageVector? = null
