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

public val Icons.Outline.StarExclamation: ImageVector
    get() {
        if (_starExclamation != null) {
            return _starExclamation!!
        }
        _starExclamation = Builder(name = "StarExclamation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(11.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.062f, 10.261f)
                curveToRelative(-0.376f, -1.151f, -0.363f, -1.111f, -0.738f, -2.261f)
                horizontalLineToRelative(-7.697f)
                lineTo(13.254f, 0.604f)
                horizontalLineToRelative(-2.383f)
                lineToRelative(-2.373f, 7.396f)
                lineTo(0.801f, 8.0f)
                curveToRelative(-0.376f, 1.151f, -0.363f, 1.111f, -0.738f, 2.261f)
                lineToRelative(6.241f, 4.562f)
                lineToRelative(-2.392f, 7.401f)
                curveToRelative(0.985f, 0.71f, 0.947f, 0.683f, 1.932f, 1.393f)
                lineToRelative(3.157f, -2.32f)
                verticalLineToRelative(-2.482f)
                lineToRelative(-2.472f, 1.817f)
                lineToRelative(2.123f, -6.57f)
                lineToRelative(-5.557f, -4.062f)
                horizontalLineToRelative(6.863f)
                lineToRelative(2.106f, -6.563f)
                lineToRelative(2.106f, 6.563f)
                horizontalLineToRelative(6.863f)
                lineToRelative(-5.557f, 4.062f)
                lineToRelative(2.123f, 6.57f)
                lineToRelative(-2.597f, -1.909f)
                verticalLineToRelative(2.482f)
                lineToRelative(3.282f, 2.412f)
                curveToRelative(0.985f, -0.71f, 0.947f, -0.683f, 1.932f, -1.393f)
                lineToRelative(-2.392f, -7.401f)
                lineToRelative(6.241f, -4.562f)
                close()
            }
        }
        .build()
        return _starExclamation!!
    }

private var _starExclamation: ImageVector? = null
