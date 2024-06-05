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

public val Icons.Outline.Monument: ImageVector
    get() {
        if (_monument != null) {
            return _monument!!
        }
        _monument = Builder(name = "Monument", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 22.0f)
                close()
                moveTo(22.0f, 20.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.114f)
                lineToRelative(1.526f, -12.97f)
                curveToRelative(0.078f, -0.667f, 0.383f, -1.296f, 0.858f, -1.771f)
                lineTo(9.879f, 0.879f)
                curveToRelative(1.133f, -1.134f, 3.109f, -1.134f, 4.243f, 0.0f)
                lineToRelative(2.38f, 2.38f)
                curveToRelative(0.475f, 0.475f, 0.78f, 1.104f, 0.858f, 1.771f)
                lineToRelative(1.526f, 12.969f)
                horizontalLineToRelative(3.114f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.578f, 7.0f)
                horizontalLineToRelative(-2.578f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(3.872f)
                lineToRelative(-1.294f, -11.0f)
                close()
                moveTo(8.912f, 4.673f)
                curveToRelative(-0.094f, 0.094f, -0.167f, 0.205f, -0.217f, 0.327f)
                horizontalLineToRelative(6.609f)
                curveToRelative(-0.05f, -0.121f, -0.123f, -0.233f, -0.217f, -0.327f)
                lineToRelative(-2.381f, -2.38f)
                curveToRelative(-0.378f, -0.378f, -1.037f, -0.378f, -1.414f, 0.0f)
                lineToRelative(-2.381f, 2.38f)
                close()
                moveTo(7.128f, 18.0f)
                horizontalLineToRelative(3.872f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(-2.578f)
                lineToRelative(-1.294f, 11.0f)
                close()
            }
        }
        .build()
        return _monument!!
    }

private var _monument: ImageVector? = null
