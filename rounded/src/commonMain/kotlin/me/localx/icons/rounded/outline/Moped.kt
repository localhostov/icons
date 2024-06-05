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

public val Icons.Outline.Moped: ImageVector
    get() {
        if (_moped != null) {
            return _moped!!
        }
        _moped = Builder(name = "Moped", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 15.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(23.0f, 13.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.268f, 0.0f, -0.534f, 0.018f, -0.797f, 0.049f)
                lineToRelative(-1.676f, -4.312f)
                curveToRelative(0.289f, 0.163f, 0.618f, 0.263f, 0.974f, 0.263f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.893f, 0.0f, -1.64f, 0.589f, -1.897f, 1.397f)
                curveToRelative(-0.639f, -1.458f, -2.051f, -2.397f, -3.655f, -2.397f)
                horizontalLineToRelative(-0.448f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.448f)
                curveToRelative(0.817f, 0.0f, 1.566f, 0.513f, 1.864f, 1.275f)
                lineToRelative(2.447f, 6.292f)
                curveToRelative(-0.932f, 0.399f, -1.783f, 0.996f, -2.484f, 1.775f)
                lineToRelative(-1.641f, 1.947f)
                curveToRelative(-0.381f, 0.452f, -0.938f, 0.711f, -1.529f, 0.711f)
                horizontalLineToRelative(-0.229f)
                lineToRelative(-2.194f, -5.485f)
                curveToRelative(-0.61f, -1.528f, -2.068f, -2.515f, -3.714f, -2.515f)
                horizontalLineToRelative(-1.969f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.533f, 0.877f, 2.852f, 2.146f, 3.523f)
                curveToRelative(-0.091f, 0.315f, -0.146f, 0.641f, -0.146f, 0.977f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, -0.016f, -0.335f, -0.04f, -0.5f)
                horizontalLineToRelative(3.145f)
                curveToRelative(1.182f, 0.0f, 2.297f, -0.518f, 3.059f, -1.422f)
                lineToRelative(1.619f, -1.923f)
                curveToRelative(0.947f, -1.052f, 2.302f, -1.655f, 3.717f, -1.655f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(4.0f, 16.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.969f)
                curveToRelative(0.822f, 0.0f, 1.552f, 0.493f, 1.856f, 1.257f)
                lineToRelative(1.897f, 4.743f)
                horizontalLineToRelative(-5.723f)
                close()
            }
        }
        .build()
        return _moped!!
    }

private var _moped: ImageVector? = null
