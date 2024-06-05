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

public val Icons.Filled.AustralSign: ImageVector
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
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.55f)
                lineTo(14.69f, 1.66f)
                curveToRelative(-0.51f, -1.02f, -1.54f, -1.66f, -2.68f, -1.66f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.15f, 0.0f, -2.17f, 0.64f, -2.71f, 1.72f)
                lineToRelative(-3.87f, 9.28f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.58f, 13.0f)
                lineToRelative(-0.83f, 2.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.92f, 17.0f)
                lineTo(0.0f, 24.0f)
                lineTo(2.16f, 24.0f)
                lineToRelative(2.92f, -7.0f)
                horizontalLineToRelative(13.64f)
                lineToRelative(2.82f, 7.0f)
                horizontalLineToRelative(2.16f)
                lineToRelative(-2.82f, -7.0f)
                horizontalLineToRelative(3.13f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.93f)
                lineToRelative(-0.81f, -2.0f)
                horizontalLineToRelative(4.74f)
                close()
                moveTo(11.11f, 2.55f)
                curveToRelative(0.17f, -0.35f, 0.51f, -0.55f, 0.89f, -0.55f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, 0.0f, 0.72f, 0.21f, 0.86f, 0.48f)
                lineToRelative(3.43f, 8.52f)
                lineTo(7.58f, 11.0f)
                lineTo(11.11f, 2.55f)
                close()
                moveTo(17.91f, 15.0f)
                lineTo(5.92f, 15.0f)
                lineToRelative(0.83f, -2.0f)
                horizontalLineToRelative(10.35f)
                lineToRelative(0.81f, 2.0f)
                close()
            }
        }
        .build()
        return _australSign!!
    }

private var _australSign: ImageVector? = null
