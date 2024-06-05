package me.localx.icons.straight.bold

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

public val Icons.Bold.AustralSign: ImageVector
    get() {
        if (_australSign != null) {
            return _australSign!!
        }
        _australSign = Builder(name = "AustralSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.63f)
                lineTo(15.13f, 1.94f)
                curveToRelative(-0.6f, -1.19f, -1.8f, -1.94f, -3.13f, -1.94f)
                reflectiveCurveToRelative(-2.54f, 0.75f, -3.17f, 2.03f)
                lineToRelative(-3.2f, 7.97f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.42f, 13.0f)
                lineToRelative(-0.8f, 2.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.41f, 18.0f)
                lineTo(0.0f, 24.0f)
                lineTo(3.25f, 24.0f)
                lineToRelative(2.4f, -6.0f)
                horizontalLineToRelative(12.7f)
                lineToRelative(2.41f, 6.0f)
                horizontalLineToRelative(3.24f)
                lineToRelative(-2.41f, -6.0f)
                horizontalLineToRelative(2.41f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.62f)
                lineToRelative(-0.8f, -2.0f)
                horizontalLineToRelative(4.42f)
                close()
                moveTo(11.56f, 3.28f)
                curveToRelative(0.09f, -0.18f, 0.25f, -0.28f, 0.45f, -0.28f)
                reflectiveCurveToRelative(0.36f, 0.11f, 0.4f, 0.17f)
                lineToRelative(2.74f, 6.83f)
                horizontalLineToRelative(-6.28f)
                lineToRelative(2.7f, -6.72f)
                close()
                moveTo(17.16f, 15.0f)
                lineTo(6.86f, 15.0f)
                lineToRelative(0.8f, -2.0f)
                horizontalLineToRelative(8.69f)
                lineToRelative(0.8f, 2.0f)
                close()
            }
        }
        .build()
        return _australSign!!
    }

private var _australSign: ImageVector? = null
