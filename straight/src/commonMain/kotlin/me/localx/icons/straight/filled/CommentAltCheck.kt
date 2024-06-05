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

public val Icons.Filled.CommentAltCheck: ImageVector
    get() {
        if (_commentAltCheck != null) {
            return _commentAltCheck!!
        }
        _commentAltCheck = Builder(name = "CommentAltCheck", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(6.923f)
                lineToRelative(3.748f, 3.157f)
                curveToRelative(0.382f, 0.339f, 0.862f, 0.507f, 1.337f, 0.507f)
                curveToRelative(0.468f, 0.0f, 0.931f, -0.162f, 1.293f, -0.484f)
                lineToRelative(3.847f, -3.18f)
                horizontalLineToRelative(6.852f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(11.91f, 14.418f)
                curveToRelative(-0.387f, 0.387f, -0.897f, 0.581f, -1.408f, 0.581f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.585f)
                lineToRelative(-3.785f, -3.699f)
                lineToRelative(1.397f, -1.431f)
                lineToRelative(3.793f, 3.707f)
                lineToRelative(6.806f, -6.703f)
                lineToRelative(1.404f, 1.423f)
                lineToRelative(-6.792f, 6.707f)
                close()
            }
        }
        .build()
        return _commentAltCheck!!
    }

private var _commentAltCheck: ImageVector? = null
