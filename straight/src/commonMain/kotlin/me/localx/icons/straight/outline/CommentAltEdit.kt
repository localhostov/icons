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
                moveToRelative(12.879f, 4.879f)
                lineToRelative(-6.879f, 6.878f)
                verticalLineToRelative(4.243f)
                horizontalLineToRelative(4.242f)
                lineToRelative(6.879f, -6.878f)
                curveToRelative(0.566f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.313f, -1.555f, -0.879f, -2.121f)
                curveToRelative(-1.17f, -1.17f, -3.072f, -1.17f, -4.242f, 0.0f)
                close()
                moveTo(15.707f, 7.707f)
                lineToRelative(-6.293f, 6.293f)
                horizontalLineToRelative(-1.414f)
                verticalLineToRelative(-1.415f)
                lineToRelative(6.293f, -6.292f)
                curveToRelative(0.391f, -0.39f, 1.023f, -0.39f, 1.414f, 0.0f)
                curveToRelative(0.189f, 0.188f, 0.293f, 0.439f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.293f, 0.707f)
                close()
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(6.923f)
                lineToRelative(3.749f, 3.157f)
                curveToRelative(0.382f, 0.339f, 0.861f, 0.507f, 1.337f, 0.507f)
                curveToRelative(0.468f, 0.0f, 0.931f, -0.163f, 1.292f, -0.484f)
                lineToRelative(3.848f, -3.18f)
                horizontalLineToRelative(6.852f)
                lineTo(24.001f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 18.0f)
                horizontalLineToRelative(-5.571f)
                lineToRelative(-4.448f, 3.645f)
                lineToRelative(-4.327f, -3.645f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                close()
            }
        }
        .build()
        return _commentAltEdit!!
    }

private var _commentAltEdit: ImageVector? = null
