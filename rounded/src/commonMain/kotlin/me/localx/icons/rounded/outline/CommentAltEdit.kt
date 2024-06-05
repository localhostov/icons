package me.localx.icons.rounded.outline

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

public val Icons.Outline.CommentAltEdit: ImageVector
    get() {
        if (_commentAltEdit != null) {
            return _commentAltEdit!!
        }
        _commentAltEdit = Builder(name = "CommentAltEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(2.923f)
                lineToRelative(3.749f, 3.157f)
                curveToRelative(0.382f, 0.339f, 0.861f, 0.507f, 1.337f, 0.507f)
                curveToRelative(0.468f, 0.0f, 0.931f, -0.163f, 1.292f, -0.484f)
                lineToRelative(3.848f, -3.18f)
                horizontalLineToRelative(2.852f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(24.001f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.212f)
                curveToRelative(-0.232f, 0.0f, -0.458f, 0.081f, -0.637f, 0.229f)
                lineToRelative(-4.171f, 3.416f)
                lineToRelative(-4.048f, -3.41f)
                curveToRelative(-0.181f, -0.152f, -0.409f, -0.235f, -0.645f, -0.235f)
                horizontalLineToRelative(-3.288f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(1.999f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(12.879f, 4.879f)
                lineToRelative(-5.707f, 5.707f)
                curveToRelative(-0.756f, 0.755f, -1.172f, 1.76f, -1.172f, 2.828f)
                verticalLineToRelative(1.586f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.586f)
                curveToRelative(1.068f, 0.0f, 2.073f, -0.417f, 2.828f, -1.172f)
                lineToRelative(5.707f, -5.707f)
                curveToRelative(0.566f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.313f, -1.555f, -0.879f, -2.121f)
                curveToRelative(-1.17f, -1.17f, -3.072f, -1.17f, -4.242f, 0.0f)
                close()
                moveTo(15.707f, 7.707f)
                lineToRelative(-5.707f, 5.707f)
                curveToRelative(-0.378f, 0.378f, -0.88f, 0.586f, -1.414f, 0.586f)
                horizontalLineToRelative(-0.586f)
                verticalLineToRelative(-0.586f)
                curveToRelative(0.0f, -0.526f, 0.214f, -1.042f, 0.586f, -1.414f)
                lineToRelative(5.707f, -5.707f)
                curveToRelative(0.391f, -0.39f, 1.023f, -0.39f, 1.414f, 0.0f)
                curveToRelative(0.189f, 0.188f, 0.293f, 0.439f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.293f, 0.707f)
                close()
            }
        }
        .build()
        return _commentAltEdit!!
    }

private var _commentAltEdit: ImageVector? = null
