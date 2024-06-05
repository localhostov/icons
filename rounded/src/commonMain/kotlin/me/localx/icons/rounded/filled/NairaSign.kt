package me.localx.icons.rounded.filled

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

public val Icons.Filled.NairaSign: ImageVector
    get() {
        if (_nairaSign != null) {
            return _nairaSign!!
        }
        _nairaSign = Builder(name = "NairaSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(22.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                lineTo(20.0f, 11.0f)
                horizontalLineToRelative(-7.45f)
                lineTo(6.14f, 1.03f)
                curveTo(5.59f, 0.19f, 4.58f, -0.19f, 3.61f, 0.09f)
                curveToRelative(-0.96f, 0.28f, -1.61f, 1.15f, -1.61f, 2.16f)
                lineTo(2.0f, 11.0f)
                lineTo(1.0f, 11.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(4.0f, 13.0f)
                horizontalLineToRelative(7.45f)
                lineToRelative(6.41f, 9.97f)
                curveToRelative(0.42f, 0.66f, 1.13f, 1.03f, 1.88f, 1.03f)
                curveToRelative(0.21f, 0.0f, 0.43f, -0.03f, 0.64f, -0.09f)
                curveToRelative(0.96f, -0.28f, 1.61f, -1.15f, 1.61f, -2.16f)
                lineTo(21.99f, 13.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(4.0f, 11.0f)
                lineTo(4.0f, 2.25f)
                reflectiveCurveToRelative(0.0f, -0.18f, 0.18f, -0.24f)
                curveToRelative(0.18f, -0.06f, 0.25f, 0.06f, 0.28f, 0.1f)
                lineToRelative(5.71f, 8.89f)
                lineTo(4.0f, 11.0f)
                close()
                moveTo(20.0f, 21.75f)
                reflectiveCurveToRelative(0.0f, 0.18f, -0.18f, 0.24f)
                curveToRelative(-0.18f, 0.06f, -0.25f, -0.06f, -0.28f, -0.1f)
                lineToRelative(-5.71f, -8.89f)
                horizontalLineToRelative(6.17f)
                verticalLineToRelative(8.75f)
                close()
            }
        }
        .build()
        return _nairaSign!!
    }

private var _nairaSign: ImageVector? = null
