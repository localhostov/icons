package me.localx.icons.rounded.bold

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

public val Icons.Bold.CommentAltCheck: ImageVector
    get() {
        if (_commentAltCheck != null) {
            return _commentAltCheck!!
        }
        _commentAltCheck = Builder(name = "CommentAltCheck", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.068f, 6.447f)
                curveToRelative(0.582f, 0.59f, 0.574f, 1.54f, -0.016f, 2.121f)
                lineToRelative(-5.793f, 5.707f)
                curveToRelative(-0.482f, 0.482f, -1.119f, 0.724f, -1.757f, 0.724f)
                reflectiveCurveToRelative(-1.282f, -0.244f, -1.771f, -0.732f)
                lineToRelative(-2.776f, -2.69f)
                curveToRelative(-0.595f, -0.577f, -0.61f, -1.526f, -0.033f, -2.121f)
                curveToRelative(0.578f, -0.595f, 1.526f, -0.609f, 2.121f, -0.033f)
                lineToRelative(2.453f, 2.378f)
                lineToRelative(5.45f, -5.369f)
                curveToRelative(0.59f, -0.582f, 1.542f, -0.573f, 2.121f, 0.016f)
                close()
                moveTo(24.0f, 5.338f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-1.172f)
                lineToRelative(-3.708f, 3.065f)
                curveToRelative(-0.448f, 0.399f, -1.024f, 0.601f, -1.607f, 0.601f)
                curveToRelative(-0.594f, 0.0f, -1.195f, -0.21f, -1.674f, -0.635f)
                lineToRelative(-3.598f, -3.031f)
                horizontalLineToRelative(-1.241f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(-0.0f, 5.338f)
                curveTo(0.0f, 2.305f, 2.467f, -0.162f, 5.5f, -0.162f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 5.338f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 2.838f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.789f)
                curveToRelative(0.354f, 0.0f, 0.696f, 0.125f, 0.966f, 0.353f)
                lineToRelative(3.749f, 3.158f)
                lineToRelative(3.829f, -3.167f)
                curveToRelative(0.27f, -0.223f, 0.607f, -0.344f, 0.956f, -0.344f)
                horizontalLineToRelative(1.712f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(21.001f, 5.338f)
                close()
            }
        }
        .build()
        return _commentAltCheck!!
    }

private var _commentAltCheck: ImageVector? = null
