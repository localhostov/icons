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

public val Icons.Bold.RupeeSign: ImageVector
    get() {
        if (_rupeeSign != null) {
            return _rupeeSign!!
        }
        _rupeeSign = Builder(name = "RupeeSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.227f, 15.32f)
                curveTo(19.023f, 11.819f, 16.661f, 0.098f, 8.0f, 0.0f)
                horizontalLineToRelative(-2.5f)
                curveTo(2.467f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                lineTo(0.0f, 22.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.057f, 0.0f, 0.115f, 0.0f, 0.172f, -0.002f)
                lineToRelative(4.017f, 7.231f)
                curveToRelative(0.404f, 0.731f, 1.329f, 0.981f, 2.04f, 0.583f)
                curveToRelative(0.724f, -0.402f, 0.985f, -1.315f, 0.583f, -2.04f)
                lineToRelative(-3.585f, -6.452f)
                close()
                moveTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(6.609f, 0.211f, 6.605f, 9.791f, 0.0f, 10.0f)
                lineTo(3.0f, 13.0f)
                lineTo(3.0f, 5.5f)
                close()
                moveTo(24.0f, 20.413f)
                curveToRelative(0.0f, 1.978f, -1.609f, 3.587f, -3.587f, 3.587f)
                horizontalLineToRelative(-1.181f)
                curveToRelative(-1.245f, 0.0f, -2.407f, -0.67f, -3.031f, -1.749f)
                curveToRelative(-0.414f, -0.717f, -0.169f, -1.635f, 0.548f, -2.05f)
                curveToRelative(0.716f, -0.414f, 1.634f, -0.169f, 2.05f, 0.548f)
                curveToRelative(0.091f, 0.157f, 0.253f, 0.251f, 0.434f, 0.251f)
                horizontalLineToRelative(1.181f)
                curveToRelative(0.629f, 0.018f, 0.808f, -0.915f, 0.219f, -1.132f)
                lineToRelative(-2.378f, -0.951f)
                curveToRelative(-3.628f, -1.432f, -2.565f, -6.926f, 1.333f, -6.917f)
                horizontalLineToRelative(1.181f)
                curveToRelative(1.245f, 0.0f, 2.407f, 0.67f, 3.031f, 1.749f)
                curveToRelative(0.414f, 0.717f, 0.169f, 1.635f, -0.548f, 2.05f)
                curveToRelative(-0.717f, 0.414f, -1.635f, 0.169f, -2.05f, -0.548f)
                curveToRelative(-0.091f, -0.157f, -0.253f, -0.251f, -0.434f, -0.251f)
                horizontalLineToRelative(-1.181f)
                curveToRelative(-0.629f, -0.018f, -0.808f, 0.915f, -0.219f, 1.132f)
                lineToRelative(2.378f, 0.951f)
                curveToRelative(1.369f, 0.547f, 2.254f, 1.854f, 2.254f, 3.33f)
                close()
            }
        }
        .build()
        return _rupeeSign!!
    }

private var _rupeeSign: ImageVector? = null
